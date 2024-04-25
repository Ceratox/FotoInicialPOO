package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class BookingStatusDTO {
	
	private UUID _code;
	private String _name;
	
	public BookingStatusDTO()
	{
		super();
	}
	
	public BookingStatusDTO( UUID newCode, String newName )
	{
		setCode(newCode);
		setName(newName);
	}
	
	// Setters 
	
	public final BookingStatusDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final BookingStatusDTO setName( String newName )
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
