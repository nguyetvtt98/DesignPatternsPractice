package factorymethod.imagefilters;

public interface ImageFilter {

//	FileType getType();
	String apply(byte[] imageData);
}
