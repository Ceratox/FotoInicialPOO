package co.edu.uco.qiu.config.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public final class AttentionDTO {

	private UUID _code;
	private BookingDTO _booking;
	private UserDTO _client; 
	private UserDTO _worker;
	private LocalDateTime _timeStamp;
	private ModuleDTO _module;
	private BookingStatusDTO _status;
	
	public AttentionDTO()
	{
		super();
	}
	
	public AttentionDTO(
			
		UUID code,
		BookingDTO booking,
		UserDTO client,
		UserDTO worker,
		LocalDateTime timeStamp,
		ModuleDTO module,
		BookingStatusDTO status
			
	)
	{
		setCode(code);
		setBooking(booking);
		setClient(client);
		setWorker(worker);
		setTimeStamp(timeStamp);
		setModule(module);
		setStatus(status);
	}
	
	// Setters 
	
	public final AttentionDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final AttentionDTO setBooking( BookingDTO newBooking )
	{
		this._booking = newBooking;
		return this;
	}
	
	public final AttentionDTO setClient( UserDTO newClient )
	{
		this._client = newClient;
		return this;
	}
	
	public final AttentionDTO setWorker( UserDTO newWorker )
	{
		this._worker = newWorker;
		return this;
	}
	
	public final AttentionDTO setTimeStamp( LocalDateTime newTimeStamp )
	{
		this._timeStamp = newTimeStamp;
		return this;
	}
	
	public final AttentionDTO setModule( ModuleDTO newModule )
	{
		this._module = newModule;
		return this;
	}
	
	public final AttentionDTO setStatus( BookingStatusDTO newStatusDTO )
	{
		this._status = newStatusDTO;
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final BookingDTO getBooking()
	{
		return this._booking;
	}
	
	public final UserDTO getClient()
	{
		return this._client;
	}
	
	public final UserDTO getWorker()
	{
		return this._worker;
	}
	
	public final LocalDateTime getTimeStamp()
	{
		return this._timeStamp;
	}
	
	public final ModuleDTO getModule()
	{
		return this._module;
	}
	
	public final BookingStatusDTO getStatus()
	{
		return this._status;
	}
}
