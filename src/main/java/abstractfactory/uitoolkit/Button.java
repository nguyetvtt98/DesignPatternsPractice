package abstractfactory.uitoolkit;

public interface Button {
	String render();
	void onClick(Runnable action);
}
