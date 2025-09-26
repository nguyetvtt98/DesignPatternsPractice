package factorymethod.documents;

public class DOCXExporter extends DocumentExporter {
	@Override
	DocumentWriter createWriter() {
		return new DOCXWriter();
	}
}
