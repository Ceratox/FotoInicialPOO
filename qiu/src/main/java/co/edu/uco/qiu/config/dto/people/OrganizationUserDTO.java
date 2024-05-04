package co.edu.uco.qiu.config.dto.people;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.dto.location.OrganizationDTO;

public final class OrganizationUserDTO extends MasterDTO {

	private UserDTO _user;
	private OrganizationDTO _organization;
	
	public OrganizationUserDTO()
	{
		super();
	}
	
	public OrganizationUserDTO(
			
		UUID code,
		UserDTO user,
		OrganizationDTO organization
			
	)
	{
		setCode(code);
		setUser(user);
		setOrganization(organization);
	}
	
	// Setters 
	
	public final OrganizationUserDTO setUser( UserDTO newUser )
	{
		ExceptionHandler.checkDtoNullParameter(newUser);
		
		this._user = newUser;
		return this;
	}
	
	public final OrganizationUserDTO setOrganization( OrganizationDTO newOrganization )
	{
		ExceptionHandler.checkDtoNullParameter(newOrganization);
		
		this._organization = newOrganization;
		return this;
	}
	
	// Getters
	
	public final UserDTO getUser() {return this._user;}
	
	public final OrganizationDTO getSectional() {return this._organization;}
	
}
