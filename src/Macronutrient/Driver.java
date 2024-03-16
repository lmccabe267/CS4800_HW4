package Macronutrient;

public class Driver {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Liam", "No Restrictions");
		Meal c1Meal = Meal.builder().setCarb(MacronutrientFactory.getInstance().buildCarbFactory().buildCarb(customer1.getDietPlan())).setProtein(MacronutrientFactory.getInstance().buildProteinFactory().buildProtein(customer1.getDietPlan())).setFat(MacronutrientFactory.getInstance().buildFatFactory().buildFat(customer1.getDietPlan())).buildMeal();
		customer1.setMeal(c1Meal);

		Customer customer2 = new Customer("Brain", "Paleo");
		Meal c2Meal = Meal.builder().setCarb(MacronutrientFactory.getInstance().buildCarbFactory().buildCarb(customer2.getDietPlan())).setProtein(MacronutrientFactory.getInstance().buildProteinFactory().buildProtein(customer2.getDietPlan())).setFat(MacronutrientFactory.getInstance().buildFatFactory().buildFat(customer2.getDietPlan())).buildMeal();
		customer2.setMeal(c2Meal);
		
		Customer customer3 = new Customer("Estevan", "Vegan");
		Meal c3Meal = Meal.builder().setCarb(MacronutrientFactory.getInstance().buildCarbFactory().buildCarb(customer3.getDietPlan())).setProtein(MacronutrientFactory.getInstance().buildProteinFactory().buildProtein(customer3.getDietPlan())).setFat(MacronutrientFactory.getInstance().buildFatFactory().buildFat(customer3.getDietPlan())).buildMeal();
		customer3.setMeal(c3Meal);
		
		Customer customer4 = new Customer("Dima", "Nut Allergy");
		Meal c4Meal = Meal.builder().setCarb(MacronutrientFactory.getInstance().buildCarbFactory().buildCarb(customer4.getDietPlan())).setProtein(MacronutrientFactory.getInstance().buildProteinFactory().buildProtein(customer4.getDietPlan())).setFat(MacronutrientFactory.getInstance().buildFatFactory().buildFat(customer4.getDietPlan())).buildMeal();
		customer4.setMeal(c4Meal);
		
		Customer customer5 = new Customer("Jeff", "Paleo");
		Meal c5Meal = Meal.builder().setCarb(MacronutrientFactory.getInstance().buildCarbFactory().buildCarb(customer5.getDietPlan())).setProtein(MacronutrientFactory.getInstance().buildProteinFactory().buildProtein(customer5.getDietPlan())).setFat(MacronutrientFactory.getInstance().buildFatFactory().buildFat(customer5.getDietPlan())).buildMeal();
		customer5.setMeal(c5Meal);
		
		Customer customer6 = new Customer("Carlo", "No Restrictions");
		Meal c6Meal = Meal.builder().setCarb(MacronutrientFactory.getInstance().buildCarbFactory().buildCarb(customer6.getDietPlan())).setProtein(MacronutrientFactory.getInstance().buildProteinFactory().buildProtein(customer6.getDietPlan())).setFat(MacronutrientFactory.getInstance().buildFatFactory().buildFat(customer6.getDietPlan())).buildMeal();
		customer6.setMeal(c6Meal);
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);
		System.out.println(customer5);
		System.out.println(customer6);
	}
}
