package abstractfactory.uitoolkit;

public class HighContrastButton implements Button {
	private Runnable action = () -> {};
	@Override
	public String render() {
		return "HighContrastButton[label=Submit]";
	}

	@Override
	public void onClick(Runnable action) {
		this.action = action == null ? () -> {} : action;
		click();
	}

	public void click() {
		action.run();
	}
}
