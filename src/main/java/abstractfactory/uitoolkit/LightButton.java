package abstractfactory.uitoolkit;

public class LightButton implements Button {
	private Runnable action = () -> {};
	@Override
	public String render() {
		return "LightButton[label=Submit]";
	}

	@Override
	public void onClick(Runnable action) {
		this.action = action == null ? () -> {} : action;
	}

	public void click() {
		action.run();
	}
}
