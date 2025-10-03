package factorymethod.imagefilters;

public class PngProcessor extends ImageProcessor {
	@Override
	ImageFilter createFilter() {
		return new PngFilter();
	}
}
