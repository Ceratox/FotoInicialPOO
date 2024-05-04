package co.edu.uco.qiu.config.dto.location;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.Phone;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;
import co.edu.uco.qiu.config.dto.people.UserDTO;

public final class SectionalDTO extends MasterDTO {
	
	private OrganizationDTO _organization;
	private String _name;
	private CityDTO _city;
	private String _address;
	private Phone _phone;
	private String _email;
	private UserDTO _admin;
	
	public SectionalDTO()
	{
		super();
	}
	
	public SectionalDTO(
			
			UUID code,
			OrganizationDTO organization,
			String name,
			CityDTO city,
			String address,
			Phone phone,
			String email,
			UserDTO admin
			
	)
	{
		setCode(code);
		setOrganization(organization);
		setName(name);
		setCity(city);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setAdmin(admin);
	}
	
	// Setters
	
	public final SectionalDTO setOrganization( OrganizationDTO newOrganization )
	{
		ExceptionHandler.checkDtoNullParameter(newOrganization);
		
		this._organization = newOrganization;
		return this;
	}
	
	public final SectionalDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final SectionalDTO setCity( CityDTO newCity )
	{
		ExceptionHandler.checkDtoNullParameter(newCity);
		
		this._city = newCity;
		return this;
	}
	
	public final SectionalDTO setAddress( String newAddress )
	{
		ExceptionHandler.checkDtoNullParameter(newAddress);
		
		this._address = StringTool.applyTrim(newAddress);
		return this;
	}
	
	public final SectionalDTO setPhone( Phone newPhone )
	{
		ExceptionHandler.checkDtoNullParameter(newPhone);
		
		this._phone = newPhone;
		return this;
	}
	
	public final SectionalDTO setEmail( String newEmail )
	{
		ExceptionHandler.checkDtoNullParameter(newEmail);
		
		this._email = StringTool.applyTrim(newEmail);
		return this;
	}
	
	public final SectionalDTO setAdmin( UserDTO newAdmin )
	{
		ExceptionHandler.checkDtoNullParameter(newAdmin);
		
		this._admin = newAdmin;
		return this;
	}
	
	// Getters
	
	public final OrganizationDTO getOrganization() {return this._organization;}
	
	public final String getName() {return this._name;}
	
	public final CityDTO getCity() {return this._city;}
	
	public final String getAddress() {return this._address;}
	
	public final Phone getPhone() {return this._phone;}
	
	public final String getEmail() {return this._email;}
	
	public final UserDTO getAdmin() {return this._admin;}

}
