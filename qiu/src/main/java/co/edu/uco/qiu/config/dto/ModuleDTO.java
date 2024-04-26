package co.edu.uco.qiu.config.dto;

import java.util.UUID;

public final class ModuleDTO {
	
	private UUID _code;
	private SectionalDTO _sectional;
	private ModuleTypeDTO _type;
	private int _indicative;
	
	public ModuleDTO()
	{
		super();
	}
	
	public ModuleDTO(
			
			UUID code,
			SectionalDTO sectional,
			ModuleTypeDTO type,
			int indicative
			
	)
	{
		super();
	}
	
	// Setters
	
	public final ModuleDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final ModuleDTO setSectional( SectionalDTO newSectional )
	{
		this._sectional = newSectional;
		return this;
	}
	
	public final ModuleDTO setType( ModuleTypeDTO newType )
	{
		this._type = newType;
		return this;
	}
	
	public final ModuleDTO setIndicative( int newIndicative )
	{
		this._indicative = newIndicative;
		return this;
	}
	
	// Getters
	
	public final UUID getCode()
	{
		return this._code;
	}
	
	public final SectionalDTO getSectional()
	{
		return this._sectional;
	}
	
	public final ModuleTypeDTO getType()
	{
		return this._type;
	}
	
	public final int getIndicative()
	{
		return this._indicative;
	}
}
