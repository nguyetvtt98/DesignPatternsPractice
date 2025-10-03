package factorymethod.imagefilters;

public class WebpProcessor extends ImageProcessor {
	@Override
	ImageFilter createFilter() {
		return new WebpFilter();
	}
}
