package factorymethod.imagefilters;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ImageProcessorFactory {
	private Map<String, Supplier<ImageProcessor>> imageProcessorByExtension = new HashMap<>();
	public ImageProcessorFactory register(String extension, Supplier<ImageProcessor> imageProcessorSupplier) {
		imageProcessorByExtension.put(extension.toLowerCase(), imageProcessorSupplier);
		return this;
	}

	public ImageProcessor resolveFor(ImageData imageData) {
		return imageProcessorByExtension.getOrDefault(imageData.extension(), () -> new DefaultImageProcessor()).get();
	}
}
