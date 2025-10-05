package abstractfactory.uitoolkit;

public class HighContrastFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new HighContrastButton();
	}

	@Override
	public TextField createTextField() {
		return new HighContrastTextField();
	}
}
