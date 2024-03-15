package PizzaQuestion;

public class Driver {
	public static class PizzaHut{
		public static Pizza.Builder createPizzaBuilder(){
			return Pizza.builder("Pizza Hut");
		}
	}
	public static class LittlCaesars{
		public static Pizza.Builder createPizzaBuilder(){
			return Pizza.builder("Littl Caesars");
		}
	}
	public static class Dominos{
		public static Pizza.Builder createPizzaBuilder(){
			return Pizza.builder("Dominos");
		}
	}
	
	public static void main(String[] args) {
		PizzaHut.createPizzaBuilder().setSize(Size.Small).addTopping(Topping.Pepperoni).addTopping(Topping.Spinach).addTopping(Topping.Ham).build().eat();
		PizzaHut.createPizzaBuilder().setSize(Size.Medium).addTopping(Topping.Pesto).addTopping(Topping.Spicy_Pork).addTopping(Topping.Ham_and_Pineapple).addTopping(Topping.Pepperoni).addTopping(Topping.Sausage).addTopping(Topping.Mushrooms).build().eat();
		PizzaHut.createPizzaBuilder().setSize(Size.Large).addTopping(Topping.Extra_Cheese).addTopping(Topping.Peppers).addTopping(Topping.Chicken).addTopping(Topping.Olives).addTopping(Topping.Spinach).addTopping(Topping.Tomato_and_Basil).addTopping(Topping.Beef).addTopping(Topping.Ham).addTopping(Topping.Ham_and_Pineapple).build().eat();
		
		
		PizzaHut.createPizzaBuilder().setSize(Size.Large).addTopping(Topping.Pepperoni).addTopping(Topping.Sausage).addTopping(Topping.Mushrooms).build().eat();
		PizzaHut.createPizzaBuilder().setSize(Size.Small).addTopping(Topping.Bacon).addTopping(Topping.Onions).build().eat();
		LittlCaesars.createPizzaBuilder().setSize(Size.Medium).addTopping(Topping.Extra_Cheese).addTopping(Topping.Peppers).addTopping(Topping.Chicken).addTopping(Topping.Olives).addTopping(Topping.Spinach).addTopping(Topping.Tomato_and_Basil).addTopping(Topping.Beef).addTopping(Topping.Ham).build().eat();
		LittlCaesars.createPizzaBuilder().setSize(Size.Small).addTopping(Topping.Pesto).addTopping(Topping.Spicy_Pork).addTopping(Topping.Ham_and_Pineapple).addTopping(Topping.Pepperoni).addTopping(Topping.Sausage).addTopping(Topping.Mushrooms).build().eat();
		Dominos.createPizzaBuilder().setSize(Size.Small).addTopping(Topping.Bacon).build().eat();
		Dominos.createPizzaBuilder().setSize(Size.Large).addTopping(Topping.Pepperoni).addTopping(Topping.Beef).addTopping(Topping.Chicken).build().eat();
	}
}
