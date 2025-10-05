package abstractfactory.uitoolkit;

public class HighContrastTextField implements TextField {

	private String text = "";
	@Override
	public String render() {
		return "HighContrastTextField[value=" + text + "]";
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
