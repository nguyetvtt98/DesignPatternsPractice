package factorymethod.imagefilters;

public class ImageProcessService {

	public void processImage(ImageData imageData) {
		ImageProcessorFactory factory = new ImageProcessorFactory()
				.register("jpg", JpegProcessor::new)
				.register("png", PngProcessor::new)
				.register("gif", GifProcessor::new)
				.register("webp", WebpProcessor::new)
				;
		ImageProcessor processor = factory.resolveFor(imageData);
		System.out.println(processor.processImage(imageData));
	}
}
