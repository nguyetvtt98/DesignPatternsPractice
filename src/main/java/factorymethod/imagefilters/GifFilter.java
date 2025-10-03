package factorymethod.imagefilters;

public class GifFilter implements ImageFilter {
	@Override
	public String apply(byte[] imageData) {
		System.out.println("Apply filtering for " + FileType.GIF);
		return "GIF[palatted=" + imageData.length + "]";
	}
}
