package co.edu.uco.qiu.config.dto.people;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class UserIdTypeDTO extends MasterDTO {
	
	private String _name;
	
	public UserIdTypeDTO()
	{
		super();
	}
	
	public UserIdTypeDTO( UUID newCode, String newName )
	{
		setCode(newCode);
		setName(newName);
	}
	
	// Setters 
	
	public final UserIdTypeDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}

}
