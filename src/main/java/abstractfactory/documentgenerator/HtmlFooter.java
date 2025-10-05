package abstractfactory.documentgenerator;

public class HtmlFooter implements Footer {
	@Override
	public String create(String text) {
		return "Html footer: " + text;
	}
}
