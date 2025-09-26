package factorymethod.documents;

public abstract class DocumentExporter {
	abstract DocumentWriter createWriter();

	public void export(Document doc) {
		DocumentWriter writer = createWriter();
		writer.write(doc);
	}
}
