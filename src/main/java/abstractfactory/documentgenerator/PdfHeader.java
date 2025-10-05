package abstractfactory.documentgenerator;

public class PdfHeader implements Header {
	@Override
	public String create(String text) {
		return "Pdf header: " + text;
	}
}
