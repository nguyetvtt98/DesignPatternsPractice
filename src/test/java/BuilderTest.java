import org.junit.jupiter.api.Test;

import builder.pizza.Cheese;
import builder.pizza.Crust;
import builder.pizza.Pizza;
import builder.pizza.PizzaBuilder;
import builder.pizza.PizzaDirectory;
import builder.pizza.Sauce;
import builder.pizza.Size;
import builder.pizza.Topping;

public class BuilderTest {

	@Test
	public void testPizzaBuilder() {
		PizzaDirectory directory = new PizzaDirectory();
		Pizza magherita = directory.margherita();
		Pizza veggiDeluxe = directory.veggieDeluxe();
		Pizza custom = new PizzaBuilder()
				.size(Size.SMALL)
				.crust(Crust.THIN)
				.cheese(Cheese.EXTRA)
				.sauce(Sauce.PESTO)
				.extraSauce(true)
				.addTopping(Topping.ONION)
				.addTopping(Topping.OLIVES)
				.addTopping(Topping.CHICKEN)
				.takeAwayBox(true)
				.build();
		System.out.println("Magherita: " + magherita);
		System.out.println("Veggi Deluxe: " + veggiDeluxe);
		System.out.println("Custom: " + custom);
	}

	@Test
	public void testStepPizzaBuilder() {
		builder.stepbuilder.pizza.Pizza myPizza = builder.stepbuilder.pizza.Pizza.builder()
				.size(builder.stepbuilder.pizza.Size.MEDIUM)
				.crust(builder.stepbuilder.pizza.Crust.THIN)
				.cheese(builder.stepbuilder.pizza.Cheese.EXTRA)
				.sauce(builder.stepbuilder.pizza.Sauce.PESTO)
				.extraSauce(true)
				.addTopping(builder.stepbuilder.pizza.Topping.CHICKEN)
				.addTopping(builder.stepbuilder.pizza.Topping.ONION)
				.takeAwayBox(true)
				.build();
		System.out.println("My pizza: " + myPizza);
	}

	@Test
	public void testHybridPizzaBuilder() {
		builder.hybrid.Pizza myHybridPizza = new builder.hybrid.PizzaBuilder()
				.size(builder.hybrid.Size.MEDIUM)
				.crust(builder.hybrid.Crust.THIN)
				.cheese(builder.hybrid.Cheese.EXTRA)
				.sauce(builder.hybrid.Sauce.TOMATO)
				.extraSauce(true)
				.takeAwayBox(true)
				.addTopping(builder.hybrid.Topping.PEPPERS)
				.addTopping(builder.hybrid.Topping.MUSHROOM)
				.addTopping(builder.hybrid.Topping.PINEAPPLE)
				.build();
		System.out.println("My Hybrid pizza: " + myHybridPizza);
	}
}
