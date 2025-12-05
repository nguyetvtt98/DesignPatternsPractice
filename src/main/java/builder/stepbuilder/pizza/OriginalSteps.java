package builder.stepbuilder.pizza;

import java.util.Collection;

public interface OriginalSteps {
	OriginalSteps sauce(Sauce sauce);
	OriginalSteps extraSauce(boolean extraSauce);
	OriginalSteps takeAwayBox(boolean takeAwayBox);
	OriginalSteps addTopping(Topping topping);
	OriginalSteps addToppings(Collection<Topping> toppings);

	Pizza build();
}
