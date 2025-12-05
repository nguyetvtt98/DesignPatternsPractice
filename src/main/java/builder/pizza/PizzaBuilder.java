package builder.pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class PizzaBuilder {

	private Size size;
	private Crust crust;
	private Cheese cheese;
	private Sauce sauce;
	private boolean extraSauce;
	private boolean takeawayBox;
	private List<Topping> toppings = new ArrayList<>();

	public Size getSize() {
		return size;
	}

	public Crust getCrust() {
		return crust;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public boolean isExtraSauce() {
		return extraSauce;
	}

	public boolean isTakeawayBox() {
		return takeawayBox;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public PizzaBuilder size(Size size) {
		this.size = Objects.requireNonNull(size);
		return this;
	}

	public PizzaBuilder cheese(Cheese cheese) {
		this.cheese = Objects.requireNonNull(cheese);
		return this;
	}

	public PizzaBuilder crust(Crust crust) {
		this.crust = Objects.requireNonNull(crust);
		return this;
	}

	public PizzaBuilder sauce(Sauce sauce) {
		this.sauce = Objects.requireNonNull(sauce);
		return this;
	}

	public PizzaBuilder extraSauce(boolean extraSauce) {
		this.extraSauce = extraSauce;
		return this;
	}

	public PizzaBuilder takeAwayBox(boolean takeawayBox) {
		this.takeawayBox = takeawayBox;
		return this;
	}

	public PizzaBuilder addTopping(Topping topping) {
		Objects.requireNonNull(topping);
		this.toppings.add(topping);
		return this;
	}

	public PizzaBuilder addToppings(Collection<Topping> toppings) {
		Objects.requireNonNull(toppings);
		this.toppings.addAll(toppings);
		return this;
	}

	public static PizzaBuilder copyOf(Pizza pizza) {
		PizzaBuilder builder = new PizzaBuilder();
		builder.size = pizza.getSize();
		builder.cheese = pizza.getCheese();
		builder.crust = pizza.getCrust();
		builder.sauce = pizza.getSauce();
		builder.extraSauce = pizza.isExtraSauce();
		builder.takeawayBox = pizza.isTakeAwayBox();
		builder.toppings = pizza.getToppings();
		return builder;
	}

	private void validate() {
		if (size == null) {
			throw new IllegalArgumentException("Size is required");
		}
		if (toppings != null && toppings.size() > 10) {
			throw new IllegalArgumentException("Too many toppings (max  10)");
		}
	}

	public Pizza build() {
		validate();
		return new Pizza(this);
	}
}
