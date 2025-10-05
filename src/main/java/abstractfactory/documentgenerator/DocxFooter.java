package abstractfactory.documentgenerator;

public class DocxFooter implements  Footer {
	@Override
	public String create(String text) {
		return "Docx footer: " + text;
	}
}
