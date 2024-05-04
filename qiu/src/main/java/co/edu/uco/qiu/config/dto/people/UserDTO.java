package co.edu.uco.qiu.config.dto.people;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.exceptions.custom.DtoQIUException;
import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.Phone;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class UserDTO extends MasterDTO {
		private UserTypeDTO _type;
	
	private UserIdTypeDTO _idType;
	private int _id;
	private String _name;
	private String _address;
	private Phone _phone;
	private String _email;
	
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
		Phone phone,
		String email, 
		
		Date signUpDate, 
		boolean verifiedStatus,
		
		String username, 
		String password
			
	)
	{
		setCode(code);
		setType(type);
		setIdType(idType);
		setId( id < 0 ? 0 : id );
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
	 
	public final UserDTO setType( UserTypeDTO newType )
	{
		ExceptionHandler.checkDtoNullParameter(newType);
		
		this._type = newType;
		return this;
	}
	
	public final UserDTO setIdType( UserIdTypeDTO newIdType )
	{
		ExceptionHandler.checkDtoNullParameter(newIdType);
		
		this._idType = newIdType;
		return this;
	}
	
	public final UserDTO setId( int newId )
	{
		if (newId == 0)
		{
			throw new DtoQIUException("Automatically set user id to 0. Sent id was either negative or null.", "Automatically set user id to 0. Sent id was either negative or null.", null);
		}
		
		this._id = newId;
		return this;
	}
	
	public final UserDTO setName( String newName )
	{
		ExceptionHandler.checkDtoNullParameter(newName);
		
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final UserDTO setAddress( String newAddress )
	{
		ExceptionHandler.checkDtoNullParameter(newAddress);
		
		this._address = StringTool.applyTrim(newAddress);
		return this;
	}
	
	public final UserDTO setPhone( Phone newPhone )
	{
		ExceptionHandler.checkDtoNullParameter(newPhone);
		
		this._phone = newPhone;
		return this;
	}
	
	public final UserDTO setEmail( String newEmail )
	{
		ExceptionHandler.checkDtoNullParameter(newEmail);
		
		this._email = StringTool.applyTrim(newEmail);
		return this;
	}
	
	public final UserDTO setSignUpDate( Date newDate )
	{
		ExceptionHandler.checkDtoNullParameter(newDate);
		
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
		ExceptionHandler.checkDtoNullParameter(newUsername);
		
		this._username = StringTool.applyTrim(newUsername);
		return this;
	}
	
	public final UserDTO setPassword( String newPassword )
	{
		ExceptionHandler.checkDtoNullParameter(newPassword);
		
		this._password = StringTool.applyTrim(newPassword);
		return this;
	}
	
	// Getters
	
	public final UserTypeDTO getType() {return this._type;}
	
	public final UserIdTypeDTO getIdType() {return this._idType;}
	
	public final int getId() {return this._id;}
	
	public final String getName() {return this._name;}
	
	public final String getAddress() {return this._address;}
	
	public final Phone getPhone() {return this._phone;}
	
	public final String getEmail() {return this._email;}
	
	public final Date getSignUpDate() {return this._signUpDate;}
	
	public final boolean isVerified() {return this._isVerified;}
	
	public final String getUsername() {return this._username;}
	
	public final String getPassword() {return this._password;}
	
}
