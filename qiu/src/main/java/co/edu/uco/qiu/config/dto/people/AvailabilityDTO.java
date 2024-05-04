package co.edu.uco.qiu.config.dto.people;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.dto.location.ModuleDTO;

public final class AvailabilityDTO extends MasterDTO {
	
	private UserDTO _worker;
	private ModuleDTO _module;
	private LocalDate _date;
	private LocalTime _startTime;
	private LocalTime _endTime;
	
	public AvailabilityDTO()
	{
		super();
	}
	
	public AvailabilityDTO(
			
			UUID code,
			UserDTO worker,
			ModuleDTO module,
			LocalDate date,
			LocalTime startTime,
			LocalTime endTime
			
	)
	{
		setCode(code);
		setWorker(worker);
		setModule(module);
		setDate(date);
		setStartTime(startTime);
		setEndTime(endTime);
	}
	
	// Setters
	
	public final AvailabilityDTO setWorker( UserDTO newWorker )
	{
		ExceptionHandler.checkDtoNullParameter(newWorker);
		
		this._worker = newWorker;
		return this;
	}
	
	public final AvailabilityDTO setModule( ModuleDTO newModule )
	{
		ExceptionHandler.checkDtoNullParameter(newModule);
		
		this._module = newModule;
		return this;
	}
	
	public final AvailabilityDTO setDate( LocalDate newDate )
	{
		ExceptionHandler.checkDtoNullParameter(newDate);
		
		this._date = newDate;
		return this;
	}
	
	public final AvailabilityDTO setStartTime( LocalTime newStartTime )
	{
		ExceptionHandler.checkDtoNullParameter(newStartTime);
		
		this._startTime = newStartTime;
		return this;
	}
	
	public final AvailabilityDTO setEndTime( LocalTime newEndTime )
	{
		ExceptionHandler.checkDtoNullParameter(newEndTime);
		
		this._endTime = newEndTime;
		return this;
	}
	
	// Getters
	
	public final UserDTO getWorker() {return this._worker;}
	
	public final ModuleDTO getModule() {return this._module;}
	
	public final LocalDate getDate() {return this._date;}
	
	public final LocalTime getStartime() {return this._startTime;}
	
	public final LocalTime getEndTime() {return this._endTime;}

}
