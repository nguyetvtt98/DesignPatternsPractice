package factorymethod.imagefilters;

public class PngFilter implements ImageFilter {

	@Override
	public String apply(byte[] imageData) {
		System.out.println("Apply filtering for " + FileType.PNG);
		return "PNG[filtered=" + imageData.length + "]";
	}
}
