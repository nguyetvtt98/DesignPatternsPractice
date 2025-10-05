package abstractfactory.documentgenerator;

public class DocumentCreator {
	private DocumentFactoryRegistry registry;
	public DocumentCreator(DocumentFactoryRegistry registry) {
		this.registry = registry;
	}

	public void createDocument(String documentType, String header, String footer) {
		DocumentFactory documentFactory = registry.get(documentType);
		Header documentHeader = documentFactory.createHeader();
		Footer documentFooter = documentFactory.createFooter();
		System.out.println(documentHeader.create(header) + " - " + documentFooter.create(footer));
	}
}
