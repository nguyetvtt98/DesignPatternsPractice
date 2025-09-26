import org.junit.jupiter.api.Test;

import factorymethod.documents.Document;
import factorymethod.documents.DocumentExporter;
import factorymethod.documents.DocumentWriter;
import factorymethod.documents.MarkdownWriter;
import factorymethod.documents.PDFDocument;
import factorymethod.documents.PDFExporter;
import factorymethod.logistics.AirTransport;
import factorymethod.logistics.Transport;
import factorymethod.logistics.TruckTransport;
import factorymethod.transportbookingsystem.BikeBooking;
import factorymethod.transportbookingsystem.BookingService;
import factorymethod.transportbookingsystem.FlightBooking;

public class FactoryMethodTest {

	@Test
	public void testExportDocument_PDF() {
		Document pdfDocument = new PDFDocument();
		DocumentExporter pdfExporter = new PDFExporter();
		pdfExporter.export(pdfDocument);
		DocumentWriter markdownWriter = new MarkdownWriter();
		markdownWriter.write(pdfDocument);
	}

	@Test
	public void testLogistics_Road() {
		Transport truckTransport = new TruckTransport();
		truckTransport.startDelivery();

		Transport airTransport = new AirTransport();
		airTransport.startDelivery();
	}

	@Test
	public void testBookingService() {
		BookingService bookingService = new BookingService();
		bookingService.bookVehicle(new BikeBooking(), "Moon", 100);
		bookingService.bookVehicle(new FlightBooking(), "Bill", 800);
	}
}
