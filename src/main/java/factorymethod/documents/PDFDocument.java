package factorymethod.documents;

import static factorymethod.documents.DocumentType.PDF;

public class PDFDocument extends Document {

	@Override
	DocumentType getType() {
		return PDF;
	}
}
