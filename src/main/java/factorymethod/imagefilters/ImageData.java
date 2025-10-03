package factorymethod.imagefilters;

import java.util.Arrays;

public class ImageData {
	private final String fileName;
	private final byte[] bytes;

	private ImageData(String fileName, byte[] bytes) {
		this.fileName = fileName;
		this.bytes = bytes;
	}

	public static ImageData from(String fileName, byte[] bytes) {
		return new ImageData(fileName, bytes);
	}

	public String getFileName() {
		return fileName;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public String extension() {
		int i = fileName.lastIndexOf(".");
		return i >= 0 ? fileName.substring(i + 1).toLowerCase() : "";
	}

	@Override
	public String toString() {
		return "ImageData{" + "fileName='" + fileName + '\'' + ", bytes=" + Arrays.toString(
				bytes) + '}';
	}
}
