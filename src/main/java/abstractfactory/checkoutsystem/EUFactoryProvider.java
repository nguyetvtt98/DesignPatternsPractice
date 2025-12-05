package abstractfactory.checkoutsystem;

public class EUFactoryProvider implements RegionFactoryProvider {
	@Override
	public String key() {
		return "EU";
	}

	@Override
	public RegionFactory create() {
		return new EUFactory();
	}
}
