package co.edu.uco.qiu.config.dto.location;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class ProvinceDTO extends MasterDTO {

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
	
	public final ProvinceDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final ProvinceDTO setCountry( CountryDTO newCountry )
	{
		ExceptionHandler.checkDtoNullParameter(newCountry);
		
		this._country = newCountry;
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}
	
	public final CountryDTO getCountry() {return this._country;}
	
}
