package factorymethod.imagefilters;

public class JpegProcessor extends ImageProcessor {
	@Override
	ImageFilter createFilter() {
		return new JpegFilter();
	}
}
