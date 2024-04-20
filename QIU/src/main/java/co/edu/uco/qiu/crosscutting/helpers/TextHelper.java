package co.edu.uco.qiu.crosscutting.helpers;

public final class TextHelper {
	
	private static final String EMPTY = "";
	
	private TextHelper()
	{
		super();
	}
	
	public static final boolean isNull( final String text)
	{
		return text == null;
	}
	
	public static final boolean isNullOrEmpty( final String text )
	{
		return isNull(text) || EMPTY.equals(applyTrim(text));
	}
	
	public static final String getDefault( final String text, final String defaultValue )
	{
		return isNullOrEmpty(text) ? defaultValue : text;
	}
	
	public static final String getDefault( final String text )
	{
		return getDefault( text, EMPTY );
	}
	
	public static final String applyTrim( final String text ) {
		return getDefault(text).trim();
	}

}
