package co.edu.uco.qiu.config.dto.people;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.dto.location.SectionalDTO;

public final class SectionalUserDTO extends MasterDTO {

	private UserDTO _user;
	private SectionalDTO _sectional;
	
	public SectionalUserDTO()
	{
		super();
	}
	
	public SectionalUserDTO(
			
		UUID code,
		UserDTO user,
		SectionalDTO sectional
			
	)
	{
		setCode(code);
		setUser(user);
		setSectional(sectional);
	}
	
	// Setters 
	
	public final SectionalUserDTO setUser( UserDTO newUser )
	{
		ExceptionHandler.checkDtoNullParameter(newUser);
		
		this._user = newUser;
		return this;
	}
	
	public final SectionalUserDTO setSectional( SectionalDTO newSectional )
	{
		ExceptionHandler.checkDtoNullParameter(newSectional);
		
		this._sectional = newSectional;
		return this;
	}
	
	// Getters
	
	public final UserDTO getUser() {return this._user;}
	
	public final SectionalDTO getSectional() {return this._sectional;}
	
}
