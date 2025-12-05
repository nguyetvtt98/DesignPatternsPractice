package abstractfactory.checkoutsystem;

public class USFactoryProvider implements RegionFactoryProvider {
	@Override
	public String key() {
		return "US";
	}

	@Override
	public RegionFactory create() {
		return new USFactory();
	}
}
