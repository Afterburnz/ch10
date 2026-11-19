public class FractionDriver {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1,9);
		Fraction f3 = new Fraction("1/46");
		Fraction f4 = new Fraction(3,9);
	f4.reduce();	
	System.out.println(Fraction.mult(f2,f3));
	System.out.println(Fraction.divide(f2,f3));	
	System.out.println(f3.toDouble());
	System.out.println(f4);
	}



}
