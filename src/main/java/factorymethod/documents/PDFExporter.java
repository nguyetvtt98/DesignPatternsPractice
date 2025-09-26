package factorymethod.documents;

public class PDFExporter extends DocumentExporter {
	@Override
	public DocumentWriter createWriter() {
		return new PDFWriter();
	}
}
