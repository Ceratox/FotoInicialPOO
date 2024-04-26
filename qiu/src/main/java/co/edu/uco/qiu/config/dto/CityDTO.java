package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class CityDTO {
	
	private UUID _code;
	private String _name;
	private ProvinceDTO _province;
	
	public CityDTO()
	{
		super();
	}
	
	public CityDTO( UUID newCode, String newName, ProvinceDTO newProvince )
	{
		setCode( newCode );
		setName( newName );
		setProvince( newProvince );
	}
	
	// Setters
	
	public final CityDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final CityDTO setName( String newName )
	{
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final CityDTO setProvince( ProvinceDTO newProvince )
	{
		this._province = newProvince;
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
	
	public final ProvinceDTO getProvince()
	{
		return this._province;
	}

}
