package factorymethod.imagefilters;

public abstract class ImageProcessor {
	abstract ImageFilter createFilter();

	String processImage(ImageData imageData) {
		ImageFilter filter = createFilter();
		return filter.apply(imageData.getBytes());
	}
}
