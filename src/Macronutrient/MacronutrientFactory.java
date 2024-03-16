package Macronutrient;

public class MacronutrientFactory {
	private static MacronutrientFactory macronutrientFactory;
	private MacronutrientFactory() {
	
	}
	
	public static MacronutrientFactory getInstance() {
		if(macronutrientFactory == null) {
			macronutrientFactory = new MacronutrientFactory();
		}
		return macronutrientFactory;
	}
	
	public CarbFactory buildCarbFactory() {
		return CarbFactory.getInstance();
	}
	
	public ProteinFactory buildProteinFactory() {
		return ProteinFactory.getInstance();
	}
	
	public FatFactory buildFatFactory() {
		return FatFactory.getInstance();
	}
	
}
