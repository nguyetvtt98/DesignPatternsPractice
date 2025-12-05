package abstractfactory.checkoutsystem;

public interface RegionFactoryProvider {
	String key();
	RegionFactory create();
}
