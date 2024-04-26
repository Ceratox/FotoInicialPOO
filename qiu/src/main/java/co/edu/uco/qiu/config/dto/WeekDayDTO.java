package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class WeekDayDTO {
	
	private UUID _code;
	private String _name;
	
	public WeekDayDTO()
	{
		super();
	}
	
	public WeekDayDTO( UUID newCode, String newName )
	{
		setCode(newCode);
		setName(newName);
	}
	
	// Setters 
	
	public final WeekDayDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final WeekDayDTO setName( String newName )
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
