package abstractfactory.documentgenerator;

public class PdfDocumentFactory implements DocumentFactory {
	@Override
	public Header createHeader() {
		return new PdfHeader();
	}

	@Override
	public Footer createFooter() {
		return new PdfFooter();
	}
}
