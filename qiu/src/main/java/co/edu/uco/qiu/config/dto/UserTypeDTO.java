package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class UserTypeDTO {
	
	private UUID _code;
	private String _name;
	
	public UserTypeDTO()
	{
		super();
	}
	
	public UserTypeDTO( UUID newCode, String newName )
	{
		setCode(newCode);
		setName(newName);
	}
	
	// Setters 
	
	public final UserTypeDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final UserTypeDTO setName( String newName )
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
