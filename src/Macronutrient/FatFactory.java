package Macronutrient;

import java.util.Random;

public class FatFactory {
	private static FatFactory fatFactory;
	private String[] types = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
	
	private FatFactory() {
		
	}
	
	public static FatFactory getInstance() {
		if(fatFactory == null) {
			fatFactory = new FatFactory();
		}
		return fatFactory;
	}
	
	public Fat buildFat(String diet) {
		String chosenItem = "";
		switch(diet) {
		case "No Restrictions":
			chosenItem = types[new Random().nextInt(types.length)];
			return Fat.builder().setItem(chosenItem).buildFat();
		case "Paleo":
			String[] paleoTypes = {"Avocado", "Tuna", "Peanuts"};
			chosenItem = paleoTypes[new Random().nextInt(paleoTypes.length)];
			return Fat.builder().setItem(chosenItem).buildFat();
		case "Vegan":
			String[] veganTypes = {"Avocado", "Peanuts"};
			chosenItem = veganTypes[new Random().nextInt(veganTypes.length)];
			return Fat.builder().setItem(chosenItem).buildFat();
		case "Nut Allergy":
			chosenItem = types[new Random().nextInt(types.length - 1)];
			return Fat.builder().setItem(chosenItem).buildFat();
		default:
			chosenItem = types[new Random().nextInt(types.length)];
			return Fat.builder().setItem(chosenItem).buildFat();
		}
	}
}
