package abstractfactory.documentgenerator;

public class PdfFooter implements Footer {
	@Override
	public String create(String text) {
		return "Pdf footer: " + text;
	}
}
