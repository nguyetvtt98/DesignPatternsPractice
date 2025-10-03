package factorymethod.imagefilters;

public class WebpFilter implements ImageFilter {
	@Override
	public String apply(byte[] imageData) {
		System.out.println("Apply filtering for " + FileType.WEBP);
		return "Webp[Webp=]" + imageData.length + "]";
	}
}
