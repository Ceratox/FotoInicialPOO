package co.edu.uco.qiu.config.crosscutting.helpers;

public final class Email {
	
	private String _username;
	private String _domain;
	
	public Email()
	{
		super();
	}
	
	public Email( String username, String domain )
	{
		this._username = StringTool.applyTrim(username);
		this._domain = StringTool.applyTrim(domain);
	}
	
	@Override
	public String toString()
	{
		return this._username + "@" + this._domain;
	}

}
