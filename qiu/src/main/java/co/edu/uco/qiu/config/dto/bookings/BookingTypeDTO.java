package co.edu.uco.qiu.config.dto.bookings;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class BookingTypeDTO extends MasterDTO {
	
	private String _name;
	
	public BookingTypeDTO()
	{
		super();
	}
	
	public BookingTypeDTO( UUID newCode, String newName )
	{
		setCode(newCode);
		setName(newName);
	}
	
	// Setters 
	
	public final BookingTypeDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	// Getters
	
	public final String getName() {return this._name;}

}
