package builder.pizza;

import java.util.List;
import java.util.Objects;

public class Pizza {

	private final Size size;

	private final Cheese cheese;
	private final Crust crust;
	private final Sauce sauce;

	private final boolean extraSauce;
	private final boolean takeAwayBox;
	private final List<Topping> toppings;

	public Pizza(PizzaBuilder builder) {
		this.size = builder.getSize();
		this.cheese = builder.getCheese();
		this.crust = builder.getCrust();
		this.sauce = builder.getSauce();
		this.extraSauce = builder.isExtraSauce();
		this.takeAwayBox = builder.isTakeawayBox();
		this.toppings = builder.getToppings();
	}

	public Size getSize() {
		return size;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public Crust getCrust() {
		return crust;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public boolean isExtraSauce() {
		return extraSauce;
	}

	public boolean isTakeAwayBox() {
		return takeAwayBox;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Pizza pizza = (Pizza) o;
		return extraSauce == pizza.extraSauce && takeAwayBox == pizza.takeAwayBox && size == pizza.size && cheese == pizza.cheese && crust == pizza.crust && sauce == pizza.sauce && Objects.equals(
				toppings, pizza.toppings);
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, cheese, crust, sauce, extraSauce, takeAwayBox, toppings);
	}

	@Override
	public String toString() {
		return "Pizza{" + "size=" + size + ", cheese=" + cheese + ", crust=" + crust + ", sauce=" + sauce + ", extraSauce=" + extraSauce + ", takeAwayBox=" + takeAwayBox + ", toppings=" + toppings + '}';
	}
}
