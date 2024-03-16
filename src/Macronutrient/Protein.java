package Macronutrient;


public class Protein {
	private String item;
	
	private Protein(Builder builder) {
		this.item = builder.item;
	}
	
	public String toString() {
		return item;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		String item = "";
		public Builder() {
			
		}
		
		public Builder setItem(String item) {
			this.item = item;
			return this;
		}
		
		public Protein buildProtein() {
			return new Protein(this);
		}
		
	}
}
