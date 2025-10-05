package abstractfactory.documentgenerator;

public class HtmlHeader implements Header {
	@Override
	public String create(String text) {
		return "Html header: " + text;
	}
}
