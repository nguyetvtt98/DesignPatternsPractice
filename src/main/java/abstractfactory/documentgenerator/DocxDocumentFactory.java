package abstractfactory.documentgenerator;

public class DocxDocumentFactory implements DocumentFactory {
	@Override
	public Header createHeader() {
		return new DocxHeader();
	}

	@Override
	public Footer createFooter() {
		return new DocxFooter();
	}
}
