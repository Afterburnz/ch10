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
	public Fraction(String s) {
		numerator = Integer.parseInt(s.substring(0,s.indexOf("/")));
		if (s.substring(s.indexOf("/")+1).equals("0")) {
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");		
		}
		denominator = Integer.parseInt(s.substring(s.indexOf("/")+1));	
	}
	
	public Fraction(Fraction f) {
		numerator = f.numerator;
		denominator = f.denominator;
	}
	
	//behaviour methods (accessor, mutator, helper)
	
	// accessor methods
	public int getNum() {
		return numerator;
	}
	public int getDenom() {
		return denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public double toDouble() {
		return (double) numerator / denominator;
	}
	// mutator methods
	public void setNum(int n) {
		numerator = n;
	}
	
	public void setDenom(int d) {
		if (d != 0) {
			denominator = d;	
		} else {
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
		}
	}
	public static Fraction mult (Fraction a, Fraction b) {
		int n = a.getNum() * b.getNum();
		int d = a.getDenom() * b.getDenom();
		return new Fraction(n,d);
	}
	public static Fraction divide (Fraction a, Fraction b) {
		int n = a.getNum() * b.getDenom();
		int d = a.getDenom() * b.getNum();
		return new Fraction(n,d);
	}	
	public void reduce() {
		int gcf = Fraction.GCF(numerator, denominator);
		numerator /= gcf;
		denominator /= gcf;
	}
	
	// helper methods
	public static int GCF (int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
}
