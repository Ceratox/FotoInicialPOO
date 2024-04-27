package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class CountryDTO {
	
	private UUID _code;
	private String _name;
	
	public CountryDTO()
	{
		super();
	}
	
	public CountryDTO( final UUID code, final String name )
	{
		setCode( code );
		setName( name );
	}
	
	// Setters
	
	public final CountryDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final CountryDTO setName( String newName )
	{
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final String getName()
	{
		return this._name;
	}

}
