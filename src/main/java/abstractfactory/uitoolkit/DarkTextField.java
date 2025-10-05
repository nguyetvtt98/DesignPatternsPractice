package abstractfactory.uitoolkit;

public class DarkTextField implements TextField {

	private String text = "";

	@Override
	public String render() {
		return "DarkTextField[value" + text + "]";
	}

	@Override
	public void setText(String text) {
		this.text = text == null ? "" : text;
	}

	@Override
	public String getText() {
		return text;
	}
}
