package factorymethod.documents;

public class PDFWriter implements DocumentWriter {
	@Override
	public void write(Document document) {
		System.out.println("Writing " + document.getType());
	}
}
