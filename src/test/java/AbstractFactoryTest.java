import org.junit.jupiter.api.Test;

import abstractfactory.databaseconnector.DatabaseConnector;
import abstractfactory.databaseconnector.DatabaseFactoryRegistry;
import abstractfactory.databaseconnector.OracleFactory;
import abstractfactory.databaseconnector.PostgresFactory;
import abstractfactory.documentgenerator.DocumentCreator;
import abstractfactory.documentgenerator.DocumentFactoryRegistry;
import abstractfactory.documentgenerator.DocxDocumentFactory;
import abstractfactory.documentgenerator.HtmlDocumentFactory;
import abstractfactory.documentgenerator.PdfDocumentFactory;
import abstractfactory.uitoolkit.DarkThemeFactory;
import abstractfactory.uitoolkit.FormComposer;
import abstractfactory.uitoolkit.HighContrastFactory;
import abstractfactory.uitoolkit.LightThemeFactory;
import abstractfactory.uitoolkit.LoginForm;
import abstractfactory.uitoolkit.UIFactory;
import abstractfactory.uitoolkit.UIFactoryRegistry;

public class AbstractFactoryTest {

	@Test
	public void testUIToolkit() {
		UIFactory light = new LightThemeFactory();
		LoginForm lightForm = new LoginForm(light);
		UIFactory dark = new DarkThemeFactory();
		LoginForm darkForm = new LoginForm(dark);

		System.out.println(lightForm.render());
		System.out.println(darkForm.render());

		FormComposer composer = new FormComposer(new UIFactoryRegistry()
				.registrer("dark", DarkThemeFactory::new)
				.registrer("light", LightThemeFactory::new)
				.registrer("highContrast", HighContrastFactory::new)
		);
		LoginForm lightForm2 = composer.compose("light");
		System.out.println(lightForm2.render());
	}

	@Test
	public void testDocumentGenerator() {
		DocumentCreator documentCreator = new DocumentCreator(new DocumentFactoryRegistry().register("PDF", PdfDocumentFactory::new)
				.register("HTML", HtmlDocumentFactory::new)
				.register("DOCX", DocxDocumentFactory::new)
			);
		documentCreator.createDocument("PDF", "Hello", "Goodbye");
		documentCreator.createDocument("DOCX", "Hello", "Goodbye");
	}

	@Test
	public void testDbConnector() {
		DatabaseConnector databaseConnector = new DatabaseConnector(new DatabaseFactoryRegistry().register("Oracle", OracleFactory::new)
				.register("Postgres", PostgresFactory::new)
		);
		databaseConnector.connectToDb("Oracle", "this is Oracle connection", "this is Oracle command");
	}
}
