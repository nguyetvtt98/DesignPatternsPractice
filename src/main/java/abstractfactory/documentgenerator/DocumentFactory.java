package abstractfactory.documentgenerator;

public interface DocumentFactory {
	Header createHeader();
	Footer createFooter();
}
