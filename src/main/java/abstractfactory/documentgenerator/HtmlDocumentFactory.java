package abstractfactory.documentgenerator;

public class HtmlDocumentFactory implements DocumentFactory {
	@Override
	public Header createHeader() {
		return new HtmlHeader();
	}

	@Override
	public Footer createFooter() {
		return new HtmlFooter();
	}
}
