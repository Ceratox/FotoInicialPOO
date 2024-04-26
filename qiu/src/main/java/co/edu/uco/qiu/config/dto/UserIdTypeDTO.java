package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class UserIdTypeDTO {
	
	private UUID _code;
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
	
	public final UserIdTypeDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final UserIdTypeDTO setName( String newName )
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
