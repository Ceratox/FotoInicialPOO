
public class Calculator {
	
	private Calculator() {};
	
	// Addition

	public static Fraction Add(Fraction F1, Fraction F2) {
		
		if ((F1 == null) || (F2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to add.");
		}
		
		int NewNumerator = (F1.GetNumerator() * F2.GetDenominator()) + (F1.GetDenominator() * F2.GetNumerator());
		int NewDenominator = F1.GetDenominator() * F2.GetDenominator();
		
		return new Fraction(NewNumerator, NewDenominator);
	};
	
	public static Fraction Add(Mixed M1, Mixed M2) {
		
		if ((M1 == null) || (M2 == null)) 
		{
			throw new RuntimeException("Got a null mixed number while trying to add.");
		}
		
		int NewWhole = M1.GetWhole() + M2.GetWhole();
		int NewNumerator = (M1.GetNumerator() * M2.GetDenominator()) + (M1.GetDenominator() * M2.GetNumerator());
		int NewDenominator = M1.GetDenominator() * M2.GetDenominator();
		
		return new Mixed(NewWhole, NewNumerator, NewDenominator);
	};
	
	// Subtraction
	
	public static Fraction Subtract(Fraction F1, Fraction F2) {
		
		if ((F1 == null) || (F2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to substract.");
		}
		
		int NewNumerator = (F1.GetNumerator() * F2.GetDenominator()) - (F1.GetDenominator() * F2.GetNumerator());
		int NewDenominator = F1.GetDenominator() * F2.GetDenominator();
		
		return new Fraction(NewNumerator, NewDenominator);
	};
	
	public static Fraction Subtract(Mixed M1, Mixed M2) {
		
		if ((M1 == null) || (M2 == null)) 
		{
			throw new RuntimeException("Got a null mixed number while trying to add.");
		}
		
		int NewWhole = M1.GetWhole() - M2.GetWhole();
		int NewNumerator = (M1.GetNumerator() * M2.GetDenominator()) - (M1.GetDenominator() * M2.GetNumerator());
		int NewDenominator = M1.GetDenominator() * M2.GetDenominator();
		
		return new Mixed(NewWhole, NewNumerator, NewDenominator);
	};
	
	// Multiplication
	
	public static Fraction Multiply(Fraction F1, Fraction F2) {
		
		if ((F1 == null) || (F2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to multiply.");
		}
		
		int NewNumerator = F1.GetNumerator() * F2.GetNumerator();
		int NewDenominator = F1.GetDenominator() * F2.GetDenominator();
		
		return new Fraction(NewNumerator, NewDenominator);
	};
	
	public static Fraction Multiply(Mixed M1, Mixed M2) {
		
		if ((M1 == null) || (M2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to multiply.");
		}
		
		int NewWhole = M1.GetWhole() * M2.GetWhole();
		int NewNumerator = M1.GetNumerator() * M2.GetNumerator();
		int NewDenominator = M1.GetDenominator() * M2.GetDenominator();
		
		return new Mixed(NewWhole, NewNumerator, NewDenominator);
	};
	
	// Division
	
	public static Fraction Divide(Fraction F1, Fraction F2) {
		
		if ((F1 == null) || (F2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to divide.");
		}
		
		if (F2.GetNumerator() == 0)
		{
			throw new RuntimeException("Could not divide fractions (Numerator of the second fraction is 0).");
		}
		
		int NewNumerator = F1.GetNumerator() * F2.GetDenominator();
		int NewDenominator = F1.GetDenominator() * F2.GetNumerator();
		
		return new Fraction(NewNumerator, NewDenominator);
	};
	
	public static Fraction Divide(Mixed M1, Mixed M2) {
		
		if ((M1 == null) || (M2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to multiply.");
		}
		
		int NewWhole = M1.GetWhole() / M2.GetWhole();
		int NewNumerator = M1.GetNumerator() * M2.GetDenominator();
		int NewDenominator = M1.GetDenominator() * M2.GetNumerator();
		
		return new Mixed(NewWhole, NewNumerator, NewDenominator);
	};
	
	// Simplification
	
	public static Fraction Simplify(Fraction F1)
	{
		int K = (F1.GetNumerator() > F1.GetDenominator()) ? F1.GetNumerator() : F1.GetDenominator();
		boolean IsNegative = false;
		
		if (F1.GetNumerator() < 0)
		{
			K *= -1;
			IsNegative = true;
		}
		
		int NewNumerator = F1.GetNumerator();
		int NewDenominator = F1.GetDenominator();
		
		while (K > 1)
		{
			if ((F1.GetNumerator() % K == 0) && (F1.GetDenominator() % K == 0))
			{
				NewNumerator /= K;
				NewDenominator /= K;
			}
			
			K -= 1;
		}
		
		NewNumerator = IsNegative ? -NewNumerator : NewNumerator;
		
		return new Fraction(NewNumerator, NewDenominator);
	};
	
	public static Fraction Simplify(Mixed M1)
	{
		int K = (M1.GetNumerator() > M1.GetDenominator()) ? M1.GetNumerator() : M1.GetDenominator();
		boolean IsNegative = false;
		
		if (M1.GetNumerator() < 0)
		{
			K *= -1;
			IsNegative = true;
		}
		
		int NewNumerator = M1.GetNumerator();
		int NewDenominator = M1.GetDenominator();
		
		while (K > 1)
		{
			if ((M1.GetNumerator() % K == 0) && (M1.GetDenominator() % K == 0))
			{
				NewNumerator /= K;
				NewDenominator /= K;
			}
			
			K -= 1;
		}
		
		int NewWhole = IsNegative ? -M1.GetWhole() : M1.GetWhole();
		
		return new Mixed(NewWhole, NewNumerator, NewDenominator);
	};
	
	// Amplification
	
	public static Fraction Amplify(Fraction F1, int Factor)
	{
		return new Fraction(F1.GetNumerator()*Factor, F1.GetDenominator()*Factor);
	};
	
	// Fraction to Mixed
	
	public static Mixed FractionToMixed(Fraction F)
	{
		int NewWhole = 0;
		boolean IsNegative = F.GetNumerator() < 0;
		int NewNumerator = Math.abs(F.GetNumerator());
		
		while (NewNumerator > F.GetDenominator())
		{
			NewWhole += 1;
			NewNumerator -= F.GetDenominator();
		}
		
		NewWhole = IsNegative ? -NewWhole : NewWhole;
		
		return new Mixed(NewWhole, NewNumerator, F.GetDenominator());
	}
	
	// Mixed to Fraction
	
	public static Fraction MixedToFraction(Mixed M)
	{
		return Calculator.Add(new Fraction(M.GetWhole(), 1), new Fraction(M.GetNumerator(), M.GetDenominator()));
	}
	
	// Proper | Improper
	
	public static boolean IsProper(Fraction F)
	{
		return (F.GetNumerator() <= F.GetDenominator());
	}
}
