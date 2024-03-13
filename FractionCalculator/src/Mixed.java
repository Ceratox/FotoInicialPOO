
public class Mixed extends Fraction { // Inherit from fraction

	private int whole = 0;
	
	// Main constructor
	
	public Mixed(int whole, int numerator, int denominator)
	{
		super(numerator, denominator); // Call inherited fraction constructor
		
		this.whole = whole;
	}
	
	//Set whole
	
	public void setWhole(int whole)
	{
		this.whole = whole;
	};
	
	// Get whole
	
	public int getWhole()
	{
		return this.whole;
	};
	
	@Override
	public String toString() 
	{
		return whole + "(" + this.getNumerator() + "/" + this.getDenominator() + ")"; // Returns something like "w(n/d)"
	}
}
