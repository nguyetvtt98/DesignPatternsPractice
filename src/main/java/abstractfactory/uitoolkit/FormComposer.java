package abstractfactory.uitoolkit;

public class  FormComposer {
	private final UIFactoryRegistry registry;
	public FormComposer(UIFactoryRegistry registry) {
		this.registry = registry;
	}

	public LoginForm compose(String themeKey) {
		return new LoginForm(registry.get(themeKey));
	}
}
