public class FractionDriver {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1,9);
		Fraction f3 = new Fraction("1/46");
		Fraction f4 = new Fraction(f3);
		
	System.out.println(f1);
	System.out.println(f2.toDouble());	
	System.out.println(f3.toDouble());
	System.out.println(f3);
	}



}
