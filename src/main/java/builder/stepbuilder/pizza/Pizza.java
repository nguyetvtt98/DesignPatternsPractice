package builder.stepbuilder.pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Pizza {
	private final Size size;
	private final Crust crust;
	private final Cheese cheese;
	private final Sauce sauce;
	private final boolean extraSauce;
	private final boolean takeAwayBox;
	private final List<Topping> toppings;

	public Pizza(PizzaStepBuilder builder) {
		this.size = builder.getSize();
		this.cheese = builder.getCheese();
		this.crust = builder.getCrust();
		this.sauce = builder.getSauce();
		this.extraSauce = builder.isExtraSauce();
		this.takeAwayBox = builder.isTakeAwayBox();
		this.toppings = builder.getToppings();
	}

	public static SizeStep builder() {
		return new PizzaStepBuilder();
	}

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
		return extraSauce == pizza.extraSauce && takeAwayBox == pizza.takeAwayBox && size == pizza.size && crust == pizza.crust && cheese == pizza.cheese && sauce == pizza.sauce && Objects.equals(
				toppings, pizza.toppings);
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, crust, cheese, sauce, extraSauce, takeAwayBox, toppings);
	}

	@Override
	public String toString() {
		return "Pizza{" + "size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", sauce=" + sauce + ", extraSauce=" + extraSauce + ", takeAwayBox=" + takeAwayBox + ", toppings=" + toppings + '}';
	}

	private static class PizzaStepBuilder implements SizeStep, CrustStep, CheeseStep, OriginalSteps {

		private Size size;
		private Crust crust;
		private Cheese cheese;
		private Sauce sauce;
		private boolean extraSauce;
		private boolean takeAwayBox;
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

		public boolean isTakeAwayBox() {
			return takeAwayBox;
		}

		public List<Topping> getToppings() {
			return toppings;
		}

		@Override
		public OriginalSteps cheese(Cheese cheese) {
			this.cheese = cheese;
			return this;
		}

		@Override
		public CheeseStep crust(Crust crust) {
			this.crust = crust;
			return this;
		}

		@Override
		public OriginalSteps sauce(Sauce sauce) {
			this.sauce = sauce;
			return this;
		}

		@Override
		public OriginalSteps extraSauce(boolean extraSauce) {
			this.extraSauce = extraSauce;
			return this;
		}

		@Override
		public OriginalSteps takeAwayBox(boolean takeAwayBox) {
			this.takeAwayBox = takeAwayBox;
			return this;
		}

		@Override
		public OriginalSteps addTopping(Topping topping) {
			this.toppings.add(Objects.requireNonNull(topping));
			return this;
		}

		@Override
		public OriginalSteps addToppings(Collection<Topping> toppings) {
			this.toppings.addAll(toppings);
			return this;
		}

		@Override
		public CrustStep size(Size size) {
			this.size = size;
			return this;
		}

		private void validate() {
			if (size == null) {
				throw new IllegalArgumentException("Size is required");
			}

			if (crust == null) {
				throw new IllegalArgumentException("Crust is required");
			}
			if (cheese == null) {
				throw new IllegalArgumentException("Cheese is required");
			}
		}

		@Override
		public Pizza build() {
			validate();
			return new Pizza(this);
		}
	}
}
