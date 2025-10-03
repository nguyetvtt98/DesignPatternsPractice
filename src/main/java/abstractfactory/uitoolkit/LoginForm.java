package abstractfactory.uitoolkit;

public class LoginForm {

	private final Button submit;
	private final TextField username;
	private final TextField password;

	public LoginForm(UIFactory factory) {
		this.username = factory.createTextField();
		this.password = factory.createTextField();
		this.submit = factory.createButton();
		this.submit.onClick(() -> {
			System.out.println("[submit clicked] username=" + username.getText());
		});
	}

	public String render() {
		username.setText("Enter your username here");
		password.setText("Enter your password here");
		return "LoginForm{\n " + username.render() + ",  \n " + password.render() + ", \n" + submit.render() + "\n}";
 	}
}
