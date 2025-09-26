package factorymethod.documents;

import static factorymethod.documents.DocumentType.XML;

public class XMLDocument extends Document {
	@Override
	DocumentType getType() {
		return XML;
	}
}
