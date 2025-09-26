package factorymethod.documents;

import static factorymethod.documents.DocumentType.DOCX;

public class DOCXDocument extends Document {
	@Override
	DocumentType getType() {
		return DOCX;
	}
}
