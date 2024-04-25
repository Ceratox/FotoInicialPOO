package co.edu.uco.qiu.config.dto;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class OrganizationDTO {

	private UUID _code;
	private OrgIdTypeDTO _idType;
	private int _id;
	private String _name;
	private String _description;
	private UserDTO _admin;
	
	private boolean _isVerified;
	
	public OrganizationDTO()
	{
		super();
	}
	
	public OrganizationDTO(
			
			UUID code,
			OrgIdTypeDTO idType,
			int id,
			String name,
			String description,
			UserDTO admin,
			boolean verifiedStatus
			
	)
	{
		setCode(code);
		setIdType(idType);
		setId(id);
		setName(name);
		setDescription(description);
		setAdmin(admin);
		setVerifiedStatus(verifiedStatus);
	}
	
	// Setters
	
	public final OrganizationDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final OrganizationDTO setIdType( OrgIdTypeDTO newIdType )
	{
		this._idType = newIdType;
		return this;
	}
	
	public final OrganizationDTO setId( int newId )
	{
		this._id = newId;
		return this;
	}
	
	public final OrganizationDTO setName( String newName )
	{
		this._name = StringTool.applyTrim(newName);
		return this;
	}
	
	public final OrganizationDTO setDescription( String newDescription )
	{
		this._description = StringTool.applyTrim(newDescription);
		return this;
	}
	
	public final OrganizationDTO setAdmin( UserDTO newAdmin )
	{
		this._admin = newAdmin;
		return this;
	}
	
	public final OrganizationDTO setVerifiedStatus( boolean newStatus )
	{
		this._isVerified = newStatus;
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final OrgIdTypeDTO getIdType()
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
	
	public final String getDescription()
	{
		return this._description;
	}
	
	public final UserDTO getAdmin()
	{
		return this._admin;
	}
	
	public final boolean isVerified()
	{
		return this._isVerified;
	}
}
