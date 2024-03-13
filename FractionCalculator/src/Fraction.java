
public class Fraction 
{
	
	private int numerator = 0;
	private int denominator = 1; // Cannot be 0
	
	// Main constructor
	
	public Fraction(int Numerator, int Denominator) 
	{
		setNumerator(Numerator);
		setDenominator(Denominator);
	};
	
	// Setters
	
	// Set numerator
	private void setNumerator(int Numerator) 
	{
		this.numerator = Numerator;
	}
	
	// Set denominator
	private void setDenominator(int Denominator) 
	{
		if (Denominator == 0) // Validate if it's 0
		{
			throw new RuntimeException("Denominator cannot be 0");
		}
		else
		{
			this.denominator = Denominator;
		}
	}
	
	// Getters
	
	// Get numerator
	public int getNumerator() 
	{
		return this.numerator;
	}
	
	// Get denominator
	public int getDenominator() 
	{
		return this.denominator;
	}

	@Override
	public String toString() 
	{
		return "(" + numerator + "/" + denominator + ")"; // Returns something like "(n/d)"
	}
}
