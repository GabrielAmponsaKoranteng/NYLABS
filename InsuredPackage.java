package question1;

public class InsuredPackage extends Package {
	private String weight;

	public InsuredPackage(int w, String s) {
		super(w, s);
		addInsurancePackage();
	}
	
	public double addInsurancePackage() {
		if(super.getShippingCost() >= 0 && super.getShippingCost() <= 25) {
		 setShippingCost(super.calculateCost()+15);
		}
		else if(super.getShippingCost() >= 26 && super.getShippingCost() <= 45) {
			setShippingCost(super.calculateCost()+25);
		}
		else if(super.getShippingCost() >= 46) {
			setShippingCost(super.calculateCost()+35);
		}
		return getShippingCost();
	}
	
	public void display() {
	    System.out.println("Weight of package: " + this.weight +"oz");
	    if(this.shippingMethod == "A") {System.out.println("Shipping Method: Air");}
	    if(this.shippingMethod == "R") {System.out.println("Shipping Method: Road");}
	    if(this.shippingMethod == "S") {System.out.println("Shipping Method: Sea");}
	    System.out.println("ShippingCost: " + this.addInsurancePackage());
	    System.out.println("***********************");
	  }
}
