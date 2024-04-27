package co.edu.uco.qiu.config.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.Email;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class UserDTO {
	
	private UUID _code;
	
	private UserTypeDTO _type;
	
	private UserIdTypeDTO _idType;
	private int _id;
	private String _name;
	private String _address;
	private int _phone;
	private Email _email;
	
	private Date _signUpDate;
	private boolean _isVerified;
	
	private String _username;
	private String _password;

	public UserDTO()
	{
		super();
	}
	
	public UserDTO( 
			
		UUID code, 
		
		UserTypeDTO type, 
		
		UserIdTypeDTO idType, 
		int id, 
		String name, 
		String address,
		int phone,
		Email email, 
		
		Date signUpDate, 
		boolean verifiedStatus,
		
		String username, 
		String password
			
	)
	{
		
		setCode(code);
		setType(type);
		setIdType(idType);
		setId(id);
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setSignUpDate(signUpDate);
		setVerifiedStatus(verifiedStatus);
		setUsername(username);
		setPassword(password);
		
	}
	
	// Setters
	
	public final UserDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final UserDTO setType( UserTypeDTO newType )
	{
		this._type = newType;
		return this;
	}
	
	public final UserDTO setIdType( UserIdTypeDTO newIdType )
	{
		this._idType = newIdType;
		return this;
	}
	
	public final UserDTO setId( int newId )
	{
		this._id = newId;
		return this;
	}
	
	public final UserDTO setName( String newName )
	{
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final UserDTO setAddress( String newAddress )
	{
		this._address = StringTool.applyTrim(newAddress);
		return this;
	}
	
	public final UserDTO setPhone( int newPhone )
	{
		this._phone = newPhone;
		return this;
	}
	
	public final UserDTO setEmail( Email newEmail )
	{
		this._email = newEmail;
		return this;
	}
	
	public final UserDTO setSignUpDate( Date newDate )
	{
		this._signUpDate = newDate;
		return this;
	}
	
	public final UserDTO setVerifiedStatus( boolean newStatus )
	{
		this._isVerified = newStatus;
		return this;
	}
	
	public final UserDTO setUsername( String newUsername )
	{
		this._username = StringTool.applyTrim(newUsername);
		return this;
	}
	
	public final UserDTO setPassword( String newPassword )
	{
		this._password = StringTool.applyTrim(newPassword);
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final UserTypeDTO getType()
	{
		return this._type;
	}
	
	public final UserIdTypeDTO getIdType()
	{
		return this._idType;
	}
	
	public final int getId()
	{
		return this._id;
	}
	
	public final String getName()
	{
		return this._name;
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
	
	public final Date getSignUpDate()
	{
		return this._signUpDate;
	}
	
	public final boolean isVerified()
	{
		return this._isVerified;
	}
	
	public final String getUsername()
	{
		return this._username;
	}
	
	public final String getPassword()
	{
		return this._password;
	}
	
}
