package co.edu.uco.qiu.config.crosscutting.helpers;

public class StringTool {

	private static final String EMPTY = "";
	
	private StringTool()
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
