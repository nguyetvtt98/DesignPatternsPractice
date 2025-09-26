package factorymethod.documents;

public class CSVExporter extends DocumentExporter {

	@Override
	DocumentWriter createWriter() {
		return new CSVWriter();
	}
}
