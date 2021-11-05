package question1;

import static java.lang.System.out;

public class Package {
    public int weightOfPackage;
    public String shippingMethod;
    private Double shippingCost;

    public Package(int weight, String string ){
        this.weightOfPackage = weight;
        this.shippingMethod = string;
    }

    public Double calculateCost() {
        if (this.weightOfPackage >= 1 && this.weightOfPackage <= 8) {
            if (this.shippingMethod == "A") {
                this.setShippingCost(40.0);
            } else if (this.getShippingCost() == 'R') {
                this.setShippingCost(10.0);
            } else if (this.getShippingCost() == 'S') {
                this.setShippingCost(25.0);
            } else if (this.weightOfPackage >= 9 && this.weightOfPackage <= 16) {
                if (this.shippingMethod == "A") {
                    this.setShippingCost(50.0);
                } else if (this.shippingMethod == "R") {
                    this.setShippingCost(25.0);
                } else if (this.shippingMethod == "S") {
                    this.setShippingCost(40.0);
                } else if (this.weightOfPackage >= 17) {
                    if (this.shippingMethod == "A") {
                        this.setShippingCost(70.0);
                    } else if (this.shippingMethod == "R") {
                        this.setShippingCost(40.0);
                    } else if (this.shippingMethod == "S") {
                        this.setShippingCost(55.0);
                    }
                }
            }
        }
        return getShippingCost();
    }

    public String getShippingMethod(){
        if(this.shippingMethod == "A" || this.shippingMethod == "a"){
            return "Air";
        }else if(this.shippingMethod == "R" || this.shippingMethod == "r"){
            return "Road";
        }else if(this.shippingMethod == "S" || this.shippingMethod == "s"){
            return "Sea";
        }else
            return "invalid";
    }

    public void display(){
        //DecimalFormat format = new DecimalFormat("##.00");
        out.println("Weight : " + weightOfPackage + " Ounces");
        out.println("Shipping method: By " + getShippingMethod());
        out.println("Shipping Cost: GHS " + getShippingCost());
    }

	public Double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(Double shippingCost) {
		this.shippingCost = shippingCost;
	}
}

