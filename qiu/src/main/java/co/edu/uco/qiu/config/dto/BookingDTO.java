package co.edu.uco.qiu.config.dto;

import java.util.UUID;

public final class BookingDTO {
	
	private UUID _code;
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
		super();
	}
	
	// Setters
	
	public final BookingDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final BookingDTO setClient( UserDTO newClient )
	{
		this._client = newClient;
		return this;
	}
	
	public final BookingDTO setAvailability( AvailabilityDTO newAvailability )
	{
		this._availability = newAvailability;
		return this;
	}
	
	public final BookingDTO setType( BookingTypeDTO newType )
	{
		this._type = newType;
		return this;
	}
	
	public BookingDTO setStatus( BookingStatusDTO newStatusDTO )
	{
		this._status = newStatusDTO;
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final UserDTO getClient()
	{
		return this._client;
	}
	
	public final AvailabilityDTO getAvailability()
	{
		return this._availability;
	}
	
	
	public final BookingTypeDTO getType()
	{
		return this._type;
	}
	
	public final BookingStatusDTO getStatus()
	{
		return this._status;
	}
}
