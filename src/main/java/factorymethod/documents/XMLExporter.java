package factorymethod.documents;

public class XMLExporter extends DocumentExporter {
	@Override
	DocumentWriter createWriter() {
		return new XMLWriter();
	}
}
