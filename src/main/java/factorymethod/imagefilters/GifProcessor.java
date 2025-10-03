package factorymethod.imagefilters;

public class GifProcessor extends ImageProcessor {
	@Override
	ImageFilter createFilter() {
		return new GifFilter();
	}
}
