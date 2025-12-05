package builder.hybrid;

import java.util.ArrayList;
import java.util.Collection;

public class PizzaBuilder {
	private Size size;
	private Crust crust;
	private Cheese cheese;
	private Sauce sauce;
	private boolean extraSauce;
	private boolean takeAwayBox;
	private Collection<Topping> toppings = new ArrayList<>();

	public PizzaBuilder size(Size size) {
		this.size = size;
		return this;
	}

	public PizzaBuilder crust(Crust crust) {
		this.crust = crust;
		return this;
	}

	public PizzaBuilder cheese(Cheese cheese) {
		this.cheese = cheese;
		return this;
	}

	public PizzaBuilder sauce(Sauce sauce) {
		this.sauce = sauce;
		return this;
	}

	public PizzaBuilder extraSauce(boolean extraSauce) {
		this.extraSauce = extraSauce;
		return this;
	}

	public PizzaBuilder takeAwayBox(boolean takeAwayBox) {
		this.takeAwayBox = takeAwayBox;
		return this;
	}

	public PizzaBuilder addTopping(Topping topping) {
		this.toppings.add(topping);
		return this;
	}

	public PizzaBuilder addToppings(Collection<Topping> toppings) {
		this.toppings.addAll(toppings);
		return this;
	}

	public Pizza build() {
		return new Pizza(size, crust, cheese, sauce, extraSauce, takeAwayBox, toppings);
	}
}
