package abstractfactory.checkoutsystem;

public record Order(String id, Money netTotal, Customer customer) {
}
