package abstractfactory.documentgenerator;

public class DocxHeader implements Header {
	@Override
	public String create(String text) {
		return "Docx header: " + text;
	}
}
