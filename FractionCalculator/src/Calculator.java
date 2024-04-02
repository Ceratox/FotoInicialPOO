
public class Calculator {
	
	private Calculator() {}; // Make the constructor private so no one can create a calculator instance
	
	// Utilities
	
	public static Fraction getAbsoluteValue(Fraction fraction) // Get the absolute value of a fraction
	{
		return new Fraction(Math.abs(fraction.getNumerator()),Math.abs(fraction.getDenominator()));
	}
	
	public static Mixed getAbsoluteValue(Mixed mixed) // Get the absolute value of a mixed number
	{
		return new Mixed(Math.abs(mixed.getWhole()), Math.abs(mixed.getNumerator()),Math.abs(mixed.getDenominator()));
	}
	
	// Addition

	public static Fraction add(Fraction fraction1, Fraction fraction2) { // Add two fractions : (fraction1 + fraction2)
		
		if ((fraction1 == null) || (fraction2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to perform addition.");
		}
		
		// Perform the addition with the following property : (a/b) + (c/d) = [(a*d) + (b*c)] / (b*d)
		int newNumerator = (fraction1.getNumerator() * fraction2.getDenominator()) + (fraction1.getDenominator() * fraction2.getNumerator());
		int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
		
		return Calculator.simplify(new Fraction(newNumerator, newDenominator));
	}
	
	public static Mixed add(Mixed mixed1, Mixed mixed2) { // Add two mixed numbers: (mixed1 + mixed2)
		
		if ((mixed1 == null) || (mixed2 == null)) 
		{
			throw new RuntimeException("Got a null mixed number while trying to perform addition.");
		}
		
		// Just add each whole number
		int newWhole = mixed1.getWhole() + mixed2.getWhole();
		
		// Perform the addition with the following property only for the fractions : (a/b) + (c/d) = [(a*d) + (b*c)] / (b*d)
		int newNumerator = (mixed1.getNumerator() * mixed2.getDenominator()) + (mixed1.getDenominator() * mixed2.getNumerator());
		int newDenominator = mixed1.getDenominator() * mixed2.getDenominator();
		
		return Calculator.simplify(new Mixed(newWhole, newNumerator, newDenominator));
	}
	
	// Subtraction
	
	public static Fraction subtract(Fraction fraction1, Fraction fraction2) { // Subtract two fractions : fraction1 - fraction2
		
		if ((fraction1 == null) || (fraction2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to perform substraction.");
		}
		
		// Perform the subtraction with the following property : (a/b) - (c/d) = [(a*d) - (b*c)] / (b*d)
		int newNumerator = (fraction1.getNumerator() * fraction2.getDenominator()) - (fraction1.getDenominator() * fraction2.getNumerator());
		int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
		
		return Calculator.simplify(new Fraction(newNumerator, newDenominator));
	}
	
	public static Mixed subtract(Mixed mixed1, Mixed mixed2) { // Subtract two mixed numbers : mixed1 - mixed2
		
		if ((mixed1 == null) || (mixed2 == null)) 
		{
			throw new RuntimeException("Got a null mixed number while trying to perform subtraction.");
		}
		
		// Just subtract each whole number
		int newWhole = mixed1.getWhole() - mixed2.getWhole();
		
		// Perform the subtraction with the following property only for the fractions : (a/b) - (c/d) = [(a*d) - (b*c)] / (b*d)
		int newNumerator = (mixed1.getNumerator() * mixed2.getDenominator()) - (mixed1.getDenominator() * mixed2.getNumerator());
		int newDenominator = mixed1.getDenominator() * mixed2.getDenominator();
		
		return Calculator.simplify(new Mixed(newWhole, newNumerator, newDenominator));
	}
	
	// Multiplication
	
	public static Fraction multiply(Fraction fraction1, Fraction fraction2) { // Multiply two fractions : fraction1 * fraction2
		
		if ((fraction1 == null) || (fraction2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to perform multiplication.");
		}
		
		// Multiply using the following property : (a/b) * (c/d) = (a*c) / (b*d)
		int newNumerator = fraction1.getNumerator() * fraction2.getNumerator();
		int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
		
		return Calculator.simplify(new Fraction(newNumerator, newDenominator));
	};
	
	public static Mixed multiply(Mixed mixed1, Mixed mixed2) { // Multiply two mixed numbers : mixed1 * mixed2
		
		if ((mixed1 == null) || (mixed2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to perform multiplication.");
		}
		
		// Just multiply each whole number
		int newWhole = mixed1.getWhole() * mixed2.getWhole();
		
		// Multiply using the following property only for the fractions: (a/b) * (c/d) = (a*c) / (b*d)
		int newNumerator = mixed1.getNumerator() * mixed2.getNumerator();
		int newDenominator = mixed1.getDenominator() * mixed2.getDenominator();
		
		return Calculator.simplify(new Mixed(newWhole, newNumerator, newDenominator));
	};
	
	// Division
	
	public static Fraction divide(Fraction fraction1, Fraction fraction2) { // Divide two fractions : fraction1 / fraction2
		
		if ((fraction1 == null) || (fraction2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to perform division.");
		}
		
		if (fraction2.getNumerator() == 0) // Numerator from fraction2 cannot be 0 as this will yield a result with a denominator equal to 0
		{
			throw new RuntimeException("Could not divide fractions (Numerator of the second fraction is 0).");
		}
		
		// Divide using the following property: (a/b) / (c/d) = (a*d) / (b*c)
		int newNumerator = fraction1.getNumerator() * fraction2.getDenominator();
		int newDenominator = fraction1.getDenominator() * fraction2.getNumerator();
		
		return Calculator.simplify(new Fraction(newNumerator, newDenominator));
	};
	
	public static Mixed divide(Mixed mixed1, Mixed mixed2) { // Divide two mixed numbers : mixed1 / mixed2
		
		if ((mixed1 == null) || (mixed2 == null)) 
		{
			throw new RuntimeException("Got a null fraction while trying to perform division.");
		}
		
		if (mixed2.getNumerator() == 0) // Numerator from mixed2 cannot be 0 as this will yield a result with a denominator equal to 0
		{
			throw new RuntimeException("Could not divide mixed numbers (Numerator of the second mixed number is 0).");
		}
		
		if (mixed2.getWhole() == 0) // Whole from mixed2 cannot be 0 as this will yield a result with a denominator equal to 0
		{
			throw new RuntimeException("Could not divide mixed numbers (Whole number of the second mixed number is 0).");
		}
		
		return Calculator.convertToMixed( Calculator.divide( Calculator.convertToFraction(mixed1), Calculator.convertToFraction(mixed2) ));
	};
	
	// Simplification
	
	public static Fraction simplify(Fraction fraction) // Simplify a fraction
	{
		// Get the biggestNumber number between the absolute value of the numerator and the denominator
		Fraction absFraction = Calculator.getAbsoluteValue(fraction);
		int biggestNumber = absFraction.getNumerator() > absFraction.getDenominator() ? absFraction.getNumerator() : absFraction.getDenominator();
		
		// Check if the fraction is negative
		boolean isNegative = (fraction.getNumerator() * fraction.getDenominator()) < 0;
		
		int newNumerator = absFraction.getNumerator();
		int newDenominator = absFraction.getDenominator();
		
		while (biggestNumber > 1)
		{
			// Check if both numerator and denominator can be divided by the same number
			if ((newNumerator % biggestNumber == 0) && (newDenominator % biggestNumber == 0))
			{
				newNumerator /= biggestNumber;
				newDenominator /= biggestNumber;
			}
			
			biggestNumber -= 1; // Lower this value until it reaches 1
		}
		
		newNumerator = isNegative ? -newNumerator : newNumerator;
		
		return new Fraction(newNumerator, newDenominator);
	};
	
	public static Mixed simplify(Mixed mixed) // Simplify a mixed number
	{
		// Get the biggestNumber number between the absolute value of the numerator and the denominator
		Mixed absMixed = Calculator.getAbsoluteValue(mixed);
		int biggestNumber = absMixed.getNumerator() > absMixed.getDenominator() ? absMixed.getNumerator() : absMixed.getDenominator();
		
		boolean isWholeNegative = mixed.getWhole() < 0;
		boolean isFractionNegative = (mixed.getNumerator() * mixed.getDenominator()) < 0;
		
		int newWhole = absMixed.getWhole();
		int newNumerator = absMixed.getNumerator();
		int newDenominator = absMixed.getDenominator();
		
		while (biggestNumber > 1)
		{
			// Check if both numerator and denominator can be divided by the same number
			if ((newNumerator % biggestNumber == 0) && (newDenominator % biggestNumber == 0))
			{
				newNumerator /= biggestNumber;
				newDenominator /= biggestNumber;
			}
			
			biggestNumber -= 1; // Lower this value until it reaches 1
		}
		
		newWhole = isWholeNegative ? -newWhole : newWhole;
		newNumerator = isFractionNegative ? - newNumerator : newNumerator;
		
		return new Mixed(newWhole, newNumerator, newDenominator);
	};
	
	// Amplification
	
	public static Fraction amplify(Fraction fraction, int factor) // Amplify a fraction
	{
		if (factor == 0) // Factor cannot be 0
		{
			throw new RuntimeException("Amplification factor cannot be 0.");
		}
		
		// Just multiply each number by the factor
		return new Fraction(fraction.getNumerator()*factor, fraction.getDenominator()*factor);
	}
	
	public static Mixed amplify(Mixed mixed, int factor) // Amplify a mixed number
	{
		if (factor == 0) // Factor cannot be 0
		{
			throw new RuntimeException("Amplification factor cannot be 0.");
		}
		
		// Just multiply each number by the factor (except the whole number)
		return new Mixed(mixed.getWhole(), mixed.getNumerator()*factor, mixed.getDenominator()*factor);
	}
	
	// Fraction to Mixed
	
	public static Mixed convertToMixed(Fraction fraction) // Name is self explanatory
	{
		int newWhole = 0;
		
		// Check if the fraction is negative
		boolean isNegative = (fraction.getNumerator() * fraction.getDenominator()) < 0;
		
		Fraction absFraction = Calculator.getAbsoluteValue(fraction);
		
		int newNumerator = absFraction.getNumerator();
		int newDenominator = absFraction.getDenominator();
		
		while (newNumerator > newDenominator)
		{
			// Take units from the fraction and add them to the whole number
			newNumerator -= newDenominator; 
			newWhole += 1;
		}
		
		newWhole = isNegative ? -newWhole : newWhole;
		
		return Calculator.simplify(new Mixed(newWhole, newNumerator, newDenominator));
	}
	
	// Mixed to Fraction
	
	public static Fraction convertToFraction(Mixed mixed) // Name is self explanatory
	{
		// Create a new fraction by adding the whole number to the mixed number's fraction
		
		// Must make sure everything is positive before performing any operation to prevent bugs
		
		boolean isNegative = mixed.getWhole() * mixed.getNumerator() * mixed.getDenominator() < 0;
		
		Mixed absMixed = Calculator.getAbsoluteValue(mixed);
		
		int newWhole = absMixed.getWhole();
		int newNumerator = absMixed.getNumerator();
		int newDenominator = absMixed.getDenominator();
		
		if (isNegative)
		{
			newWhole *= -1;
			newNumerator *= -1;
		}
		
		return Calculator.simplify(Calculator.add(new Fraction(newWhole, 1), new Fraction(newNumerator, newDenominator)));
	}
	
	// Proper | Improper
	
	public static boolean IsProper(Fraction fraction)
	{
		// Just return a boolean value based on the following comparison
		return (fraction.getNumerator() <= fraction.getDenominator());
	}
	
	public static boolean IsProper(Mixed mixed)
	{
		// Just return a boolean value based on the following comparison
		return (mixed.getNumerator() <= mixed.getDenominator());
	}
}
