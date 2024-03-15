package PizzaQuestion;

import java.util.ArrayList;

public class Pizza {
	private Size size;
	private ArrayList<Topping> toppings;
	private String pizzaChain;
	
	private Pizza(Builder builder) {
		this.size = builder.size;
		this.toppings = builder.toppings;
		this.pizzaChain = builder.pizzaChain;
	}
	
	public void eat() {
		String str = "Pizza Chain: " + pizzaChain + "\nSize: " + size + "\nToppings: ";
		for(Topping topping: toppings) {
			str += "\n" + topping;
		}
		str += "\n";
		System.out.println(str);
	}
	
	public static Builder builder(String pizzaChain) {
		return new Builder(pizzaChain);
	}
	
	public static class Builder{
		private Size size = Size.Medium;
		private ArrayList<Topping> toppings = new ArrayList<Topping>();
		private String pizzaChain;
		
		public Builder(String pizzaChain) {
			this.pizzaChain = pizzaChain;
		}
		
		public Builder addTopping(Topping topping) {
			toppings.add(topping);
			return this;
		}
		
		public Builder setSize(Size size) {
			this.size = size;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
	}
}
