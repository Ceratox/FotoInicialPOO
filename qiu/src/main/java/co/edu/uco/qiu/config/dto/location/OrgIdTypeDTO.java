package co.edu.uco.qiu.config.dto.location;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class OrgIdTypeDTO extends MasterDTO {

	private String _name;
	
	public OrgIdTypeDTO()
	{
		super();
	}
	
	public OrgIdTypeDTO( UUID newCode, String newName )
	{
		setCode(newCode);
		setName(newName);
	}
	
	// Setters 
	
	public final OrgIdTypeDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}
}
