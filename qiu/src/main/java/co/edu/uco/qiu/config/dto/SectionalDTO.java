package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.Email;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class SectionalDTO {
	
	private UUID _code;
	private OrganizationDTO _organization;
	private String _name;
	private CityDTO _city;
	private String _address;
	private int _phone;
	private Email _email;
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
			int phone,
			Email email,
			UserDTO admin
			
	)
	{
		super();
	}
	
	// Setters
	
	public final SectionalDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final SectionalDTO setOrganization( OrganizationDTO newOrganization )
	{
		this._organization = newOrganization;
		return this;
	}
	
	public final SectionalDTO setName( String newName )
	{
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final SectionalDTO setCity( CityDTO newCity )
	{
		this._city = newCity;
		return this;
	}
	
	public final SectionalDTO setAddress( String newAddress )
	{
		this._address = StringTool.applyTrim(newAddress);
		return this;
	}
	
	public final SectionalDTO setPhone( int newPhone )
	{
		this._phone = newPhone;
		return this;
	}
	
	public final SectionalDTO setEmail( Email newEmail )
	{
		this._email = newEmail;
		return this;
	}
	
	public final SectionalDTO setAdmin( UserDTO newAdmin )
	{
		this._admin = newAdmin;
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final OrganizationDTO getOrganization()
	{
		return this._organization;
	}
	
	public final String getName()
	{
		return this._name;
	}
	
	public final CityDTO getCity()
	{
		return this._city;
	}
	
	public final String getAddress()
	{
		return this._address;
	}
	
	public final int getPhone()
	{
		return this._phone;
	}
	
	public final String getEmail()
	{
		return this._email.toString();
	}
	
	public final UserDTO getAdmin()
	{
		return this._admin;
	}

}
