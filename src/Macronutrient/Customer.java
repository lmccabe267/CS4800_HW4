package Macronutrient;

public class Customer {
	private String name;
	private String dietPlan;
	private Meal meal;
	
	
	public Customer(String name, String dietPlan) {
		this.name = name;
		this.dietPlan = dietPlan;
	}
	
	public String getDietPlan() {
		return dietPlan;
	}
	
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	
	public String toString() {
		return "\nName: " + name + "\nDiet Plan: " + dietPlan + "\n" + meal;
	}
	
}
