package co.edu.uco.qiu.config.dto.bookings;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.dto.people.AvailabilityDTO;
import co.edu.uco.qiu.config.dto.people.UserDTO;

public final class BookingDTO extends MasterDTO {
	
	private UserDTO _client;
	private AvailabilityDTO _availability;
	private BookingTypeDTO _type;
	private BookingStatusDTO _status;
	
	public BookingDTO()
	{
		super();
	}
	
	public BookingDTO(
			
			UUID code,
			UserDTO client,
			AvailabilityDTO availability,
			BookingTypeDTO type,
			BookingStatusDTO status
			
	)
	{
		setCode(code);
		setClient(client);
		setAvailability(availability);
		setType(type);
		setStatus(status);
	}
	
	// Setters
	
	public final BookingDTO setClient( UserDTO newClient )
	{
		ExceptionHandler.checkDtoNullParameter(newClient);
		
		this._client = newClient;
		return this;
	}
	
	public final BookingDTO setAvailability( AvailabilityDTO newAvailability )
	{
		ExceptionHandler.checkDtoNullParameter(newAvailability);
		
		this._availability = newAvailability;
		return this;
	}
	
	public final BookingDTO setType( BookingTypeDTO newType )
	{
		ExceptionHandler.checkDtoNullParameter(newType);
		
		this._type = newType;
		return this;
	}
	
	public BookingDTO setStatus( BookingStatusDTO newStatusDTO )
	{
		ExceptionHandler.checkDtoNullParameter(newStatusDTO);
		
		this._status = newStatusDTO;
		return this;
	}
	
	// Getters
	
	public final UserDTO getClient() {return this._client;}
	
	public final AvailabilityDTO getAvailability() {return this._availability;}
	
	
	public final BookingTypeDTO getType() {return this._type;}
	
	public final BookingStatusDTO getStatus() {return this._status;}
}
