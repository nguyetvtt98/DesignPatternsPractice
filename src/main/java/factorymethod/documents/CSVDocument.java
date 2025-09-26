package factorymethod.documents;

import static factorymethod.documents.DocumentType.CSV;

public class CSVDocument extends Document {

	@Override
	DocumentType getType() {
		return CSV;
	}
}
