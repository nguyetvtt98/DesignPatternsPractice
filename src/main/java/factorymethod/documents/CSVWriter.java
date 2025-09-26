package factorymethod.documents;

public class CSVWriter implements DocumentWriter {
	@Override
	public void write(Document document) {
		System.out.println("Writing " + document.getType());
	}
}
