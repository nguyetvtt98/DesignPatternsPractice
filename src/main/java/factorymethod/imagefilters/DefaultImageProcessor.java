package factorymethod.imagefilters;

public class DefaultImageProcessor extends ImageProcessor {

	@Override
	ImageFilter createFilter() {
		return data -> "RAW[bytes=" + data.length + "]";
	}
}
