
public class Fraction 
{
	
	private int num = 0;
	private int den = 1;
	
	public Fraction(int Numerator, int Denominator) 
	{
		SetNumerator(Numerator);
		SetDenominator(Denominator);
	};
	
	// Setters
	
	private void SetNumerator(int Numerator) 
	{
		this.num = Numerator;
	}
	
	private void SetDenominator(int Denominator) 
	{
		if (Denominator == 0)
		{
			throw new RuntimeException("Denominator cannot be 0");
		}
		else
		{
			this.den = Denominator;
		}
	}
	
	// Getters
	
	public int GetNumerator() 
	{
		return this.num;
	}
	
	public int GetDenominator() 
	{
		return this.den;
	}

	@Override
	public String toString() 
	{
		return "(" + num + "/" + den + ")";
	}
}
