public class Fraction {
	//instance varaibles (attributes, fields)
	private int numerator;
	private int denominator;
	//constructor
	public Fraction () { //default constructor
		numerator = 1;
		denominator = 1;
	}
	public Fraction (int n, int d) { //parameterized constructor
		numerator = n;
		if (d != 0) {
			denominator = d;	
		} else {
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
		}
		
	}
	//behaviour methods



}
