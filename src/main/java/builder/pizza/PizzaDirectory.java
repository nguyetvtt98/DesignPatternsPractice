package builder.pizza;

public class PizzaDirectory {

	public Pizza margherita() {
		return new PizzaBuilder()
				.size(Size.MEDIUM)
				.crust(Crust.THIN)
				.cheese(Cheese.NORMAL)
				.sauce(Sauce.TOMATO)
				.build();
	}

	public Pizza meatLoversLarge() {
		return new PizzaBuilder()
				.size(Size.LARGE)
				.crust(Crust.REGULAR)
				.cheese(Cheese.EXTRA)
				.addTopping(Topping.PEPPERONI)
				.addTopping(Topping.SAUSAGE)
				.addTopping(Topping.BACON)
				.build();
	}

	public Pizza veggieDeluxe() {
		return new PizzaBuilder()
				.size(Size.MEDIUM)
				.crust(Crust.GLUTEN_FREE)
				.addTopping(Topping.MUSHROOM)
				.addTopping(Topping.PEPPERS)
				.addTopping(Topping.OLIVES)
				.addTopping(Topping.ONION)
				.build();
	}
}
