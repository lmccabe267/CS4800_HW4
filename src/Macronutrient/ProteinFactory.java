package Macronutrient;

import java.util.Random;

public class ProteinFactory {
	private static ProteinFactory proteinFactory;
	private String[] types = {"Fish", "Chicken", "Beef", "Tofu"};
	
	private ProteinFactory() {
		
	}
	
	public static ProteinFactory getInstance() {
		if(proteinFactory == null) {
			proteinFactory = new ProteinFactory();
		}
		return proteinFactory;
	}
	
	public Protein buildProtein(String diet) {
		String chosenItem = "";
		switch(diet) {
		case "No Restrictions":
			chosenItem = types[new Random().nextInt(types.length)];
			return Protein.builder().setItem(chosenItem).buildProtein();
		case "Paleo":
			chosenItem = types[new Random().nextInt(types.length - 1)];
			return Protein.builder().setItem(chosenItem).buildProtein();
		case "Vegan":
			chosenItem = types[3];
			return Protein.builder().setItem(chosenItem).buildProtein();
		case "Nut Allergy":
			chosenItem = types[new Random().nextInt(types.length)];
			return Protein.builder().setItem(chosenItem).buildProtein();
		default:
			chosenItem = types[new Random().nextInt(types.length)];
			return Protein.builder().setItem(chosenItem).buildProtein();
		}
	}
}

