import org.junit.jupiter.api.Test;

import abstractfactory.checkoutsystem.Address;
import abstractfactory.checkoutsystem.Cart;
import abstractfactory.checkoutsystem.CheckoutService;
import abstractfactory.checkoutsystem.Customer;
import abstractfactory.checkoutsystem.Money;
import abstractfactory.checkoutsystem.Order;
import abstractfactory.checkoutsystem.RegionFactoryRegistry;
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
		FormComposer composer = new FormComposer(new UIFactoryRegistry()
				.register("dark", DarkThemeFactory::new)
				.register("light", LightThemeFactory::new)
				.register("highContrast", HighContrastFactory::new)
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

	@Test
	public void testCheckoutSystem() {
		var registry = new RegionFactoryRegistry();
		System.out.println("Available regions: " + registry.keys());
		var eu = registry.get("EU");
//		var us = registry.get("US");
		var service = new CheckoutService(eu);
		var inv = service.checkout(new Order("o1", Money.of(100, "EUR"),
				new Customer("c1", false, null, "DE")),
				new Cart(2, 1.4),
				new Address("DE", "Berlin", "10015"));
		System.out.println("EU invoice" + inv);
	}
}
