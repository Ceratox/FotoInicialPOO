package co.edu.uco.qiu.config.crosscutting.helpers;

public class StringTool {

	private static final String EMPTY = "";
	public static final String UNDERSCORE = "_";
	
	private StringTool()
	{
		super();
	}
	
	public static final boolean isNull( final String text)
	{
		return ObjectHelper.getObjectHelper().isNull(text);
	}
	
	/*
		public static final boolean isNullOrEmpty( final String text )
		{
			return isNull(text) || EMPTY.equals(applyTrim(text));
		}
	*/
	
	public static final String getDefault( final String text, final String defaultValue )
	{
		return ObjectHelper.getObjectHelper().getDefaultValue(text, defaultValue);
	}
	
	public static final String getDefault( final String text )
	{
		return getDefault( text, EMPTY );
	}
	
	public static final String applyTrim( final String text ) {
		return getDefault(text).trim();
	}
	
	public static final String concatenate(String... strings) 
	{
		final var sb = new StringBuilder(EMPTY);
		
		if (ObjectHelper.getObjectHelper().isNull(strings))
		{
			for (final var string : strings)
			{
				sb.append(applyTrim(string));
			}
		}
		
		return sb.toString();
	}
}
