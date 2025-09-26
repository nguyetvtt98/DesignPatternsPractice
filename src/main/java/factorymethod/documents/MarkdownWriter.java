package factorymethod.documents;

public class MarkdownWriter implements DocumentWriter {
	@Override
	public void write(Document document) {
		System.out.println("Writing markdown for " + document.getType());
	}
}
