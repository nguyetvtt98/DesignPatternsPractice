package abstractfactory.documentgenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class DocumentFactoryRegistry {
	private Map<String, Supplier<DocumentFactory>> factoryMap = new HashMap<>();

	public DocumentFactoryRegistry register(String documentType, Supplier<DocumentFactory> factorySupplier) {
		factoryMap.put(Objects.requireNonNull(documentType), factorySupplier);
		return this;
	}

	public DocumentFactory get(String documentType) {
		return factoryMap.getOrDefault(documentType, HtmlDocumentFactory::new).get();
	}
}
