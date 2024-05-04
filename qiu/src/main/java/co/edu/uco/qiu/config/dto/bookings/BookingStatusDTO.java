package co.edu.uco.qiu.config.dto.bookings;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class BookingStatusDTO extends MasterDTO {
	
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
	
	public final BookingStatusDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}

}
