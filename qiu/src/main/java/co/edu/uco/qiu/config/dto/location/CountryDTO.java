package co.edu.uco.qiu.config.dto.location;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class CountryDTO extends MasterDTO {
	
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
	
	public final CountryDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}

}
