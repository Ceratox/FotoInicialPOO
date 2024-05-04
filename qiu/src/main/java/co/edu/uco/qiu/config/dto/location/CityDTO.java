package co.edu.uco.qiu.config.dto.location;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class CityDTO extends MasterDTO {
	
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
	
	public final CityDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final CityDTO setProvince( ProvinceDTO newProvince )
	{
		ExceptionHandler.checkDtoNullParameter(newProvince);
		
		this._province = newProvince;
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}
	
	public final ProvinceDTO getProvince() {return this._province;}

}
