package builder.hybrid;

import java.util.Collection;

public record Pizza(Size size, Crust crust, Cheese cheese, Sauce sauce, boolean extraSauce, boolean takeAwayBox, Collection<Topping> toppings) {
}
