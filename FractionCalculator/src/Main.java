
public class Main {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		Mixed m1 = new Mixed(5, 1, 2);
		Mixed m2 = new Mixed(2, 1, 2);
		
		System.out.println(Calculator.add(f1, f2).toString());
		System.out.println(Calculator.subtract(f1, f2).toString());
		System.out.println(Calculator.multiply(f1, f2).toString());
		System.out.println(Calculator.divide(f1, f2).toString());
		
		System.out.println(Calculator.simplify(f1).toString());
		System.out.println(Calculator.amplify(f1, 3).toString());
		System.out.println(Calculator.IsProper(f1));
		
		System.out.println(Calculator.add(m1, m2).toString());
		System.out.println(Calculator.subtract(m1, m2).toString());
		System.out.println(Calculator.multiply(m1, m2).toString());
		System.out.println(Calculator.divide(m1, m2).toString());
		
		System.out.println(Calculator.simplify(m1).toString());
		System.out.println(Calculator.amplify(m1, 3).toString());
		System.out.println(Calculator.IsProper(m1));
	}
}
