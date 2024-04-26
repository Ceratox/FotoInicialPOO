package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class ProvinceDTO {

	private UUID _code;
	private String _name;
	private CountryDTO _country;
	
	public ProvinceDTO()
	{
		super();
	}
	
	public ProvinceDTO( UUID newCode, String newName, CountryDTO newCountry )
	{
		setCode( newCode );
		setName( newName );
		setCountry( newCountry );
	}
	
	// Setters
	
	public final ProvinceDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final ProvinceDTO setName( String newName )
	{
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final ProvinceDTO setCountry( CountryDTO newCountry )
	{
		this._country = newCountry;
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
	
	public final CountryDTO getCountry()
	{
		return this._country;
	}
	
}
