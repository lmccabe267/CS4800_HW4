package Macronutrient;

import java.util.Random;

public class CarbFactory {
	private static CarbFactory carbFactory;
	private String[] types = {"Cheese", "Bread", "Lentils", "Pistachio"};
	
	private CarbFactory() {
		
	}
	
	public static CarbFactory getInstance() {
		if(carbFactory == null) {
			carbFactory = new CarbFactory();
		}
		return carbFactory;
	}
	
	public Carb buildCarb(String diet) {
		String chosenItem = "";
		switch(diet) {
		case "No Restrictions":
			chosenItem = types[new Random().nextInt(types.length)];
			return Carb.builder().setItem(chosenItem).buildCarb();
		case "Paleo":
			chosenItem = types[3];
			return Carb.builder().setItem(chosenItem).buildCarb();
		case "Vegan":
			chosenItem = types[new Random().nextInt(types.length-1) + 1];
			return Carb.builder().setItem(chosenItem).buildCarb();
		case "Nut Allergy":
			chosenItem = types[new Random().nextInt(types.length - 1)];
			return Carb.builder().setItem(chosenItem).buildCarb();
		default:
			chosenItem = types[new Random().nextInt(types.length)];
			return Carb.builder().setItem(chosenItem).buildCarb();
		}
	}
}
