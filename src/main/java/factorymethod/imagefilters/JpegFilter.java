package factorymethod.imagefilters;

public class JpegFilter implements ImageFilter {

	@Override
	public String apply(byte[] imageData) {
		System.out.println("Apply filtering for " + FileType.JPEG);
		return  "JPEG[compressed=" + imageData.length + "]";
	}
}
