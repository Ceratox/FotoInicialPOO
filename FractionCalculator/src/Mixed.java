
public class Mixed extends Fraction {

	private int Whole = 0;
	
	public Mixed(int Whole, int Numerator, int Denominator)
	{
		super(Numerator, Denominator);
		
		this.Whole = Whole;
	}
	
	//Setters
	
	public void SetWhole(int Whole)
	{
		this.Whole = Whole;
	};
	
	// Getters
	
	public int GetWhole()
	{
		return this.Whole;
	};
	
	@Override
	public String toString() 
	{
		return Whole + "(" + this.GetNumerator() + "/" + this.GetDenominator() + ")";
	}
}
