package Macronutrient;

public class Meal {
	private Carb carb;
	private Protein protein;
	private Fat fat;
	
	private Meal(Builder builder) {
		this.carb = builder.carb;
		this.protein = builder.protein;
		this.fat = builder.fat;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public String toString() {
		return "Carb: " + carb + ", Protein: " + protein + ", Fat: " + fat;
	}
	
	public static class Builder{
		private Carb carb;
		private Protein protein;
		private Fat fat;
		
		public Builder() {
		}
		
		public Builder setCarb(Carb carb){
			this.carb = carb;
			return this;
		}
		public Builder setProtein(Protein protein){
			this.protein = protein;
			return this;
		}
		public Builder setFat(Fat fat){
			this.fat = fat;
			return this;
		}
		public Meal buildMeal() {
			return new Meal(this);
		}
	}
}
