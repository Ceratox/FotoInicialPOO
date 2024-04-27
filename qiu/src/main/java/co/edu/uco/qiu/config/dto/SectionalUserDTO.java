package co.edu.uco.qiu.config.dto;

import java.util.UUID;

public final class SectionalUserDTO {

	private UUID _code;
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
		super();
	}
	
	// Setters 
	
	public final SectionalUserDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final SectionalUserDTO setUser( UserDTO newUser )
	{
		this._user = newUser;
		return this;
	}
	
	public final SectionalUserDTO setSectional( SectionalDTO newSectional )
	{
		this._sectional = newSectional;
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final UserDTO getUser()
	{
		return this._user;
	}
	
	public final SectionalDTO getSectional()
	{
		return this._sectional;
	}
}
