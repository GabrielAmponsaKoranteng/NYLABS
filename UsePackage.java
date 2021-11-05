package question1;

public class UsePackage {

	public static void main(String[] args) {
		Package packageOne = new Package(7,"R");
		Package packageTwo = new Package(15,"S");
		Package packageThree = new Package(18,"A");
		
		InsuredPackage insPac1 = new InsuredPackage(7, "R");
		InsuredPackage insPac2 = new InsuredPackage(15, "S");
		InsuredPackage insPac3 = new InsuredPackage(18, "A");
		
		packageOne.display();
		packageTwo.display();
		packageThree.display();
		
		insPac1.display();
		insPac2.display();
		insPac3.display();

	}

}
