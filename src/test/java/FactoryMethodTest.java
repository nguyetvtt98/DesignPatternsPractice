import org.junit.jupiter.api.Test;

import factorymethod.documents.Document;
import factorymethod.documents.DocumentExporter;
import factorymethod.documents.DocumentWriter;
import factorymethod.documents.MarkdownWriter;
import factorymethod.documents.PDFDocument;
import factorymethod.documents.PDFExporter;
import factorymethod.imagefilters.ImageData;
import factorymethod.imagefilters.ImageProcessService;
import factorymethod.logistics.AirTransport;
import factorymethod.logistics.Transport;
import factorymethod.logistics.TruckTransport;
import factorymethod.notificationsender.EmailNotification;
import factorymethod.notificationsender.NotificationService;
import factorymethod.notificationsender.SlackChannel;
import factorymethod.notificationsender.SlackNotification;
import factorymethod.paymentprocessor.PaymentProcessor;
import factorymethod.paymentprocessor.PaymentService;
import factorymethod.paymentprocessor.PaypalProcessor;
import factorymethod.paymentprocessor.VisaProcessor;
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

	@Test
	public void testImageProcessing() {
		ImageProcessService imageProcessService = new ImageProcessService();
		imageProcessService.processImage(ImageData.from("myImage.jpg", new byte[100]));
		imageProcessService.processImage(ImageData.from("myImage.gif", new byte[50]));
		imageProcessService.processImage(ImageData.from("myImage.webp", new byte[20]));
	}

	@Test
	public void testNotificationService() {
		NotificationService notificationService = new NotificationService();
		notificationService.registerNewSender(new EmailNotification());
		notificationService.sendMessage("Hello world!");
		notificationService.registerNewSender(new SlackNotification());
		notificationService.sendMessage("Another hello world!");
	}

	@Test
	public void testPaymentProcessorService() {
		PaymentService paymentService = new PaymentService();
		PaymentProcessor visaProcessor = new VisaProcessor();
		paymentService.doPayment(visaProcessor, 100);
		PaymentProcessor paymentProcessor = new PaypalProcessor();
		paymentService.doPayment(paymentProcessor, 100000);
	}
}
