package co.edu.uco.qiu.config.dto.location;

import java.util.UUID;

import co.edu.uco.qiu.config.crosscutting.helpers.ExceptionHandler;
import co.edu.uco.qiu.config.crosscutting.helpers.MasterDTO;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class ModuleDTO extends MasterDTO {
	
	private SectionalDTO _sectional;
	private ModuleTypeDTO _type;
	private String _indicative;
	
	public ModuleDTO()
	{
		super();
	}
	
	public ModuleDTO(
			
			UUID code,
			SectionalDTO sectional,
			ModuleTypeDTO type,
			String indicative
			
	)
	{
		setCode(code);
		setSectional(sectional);
		setType(type);
		setIndicative(indicative);
	}
	
	// Setters
	
	public final ModuleDTO setSectional( SectionalDTO newSectional )
	{
		ExceptionHandler.checkDtoNullParameter(newSectional);
		
		this._sectional = newSectional;
		return this;
	}
	
	public final ModuleDTO setType( ModuleTypeDTO newType )
	{
		ExceptionHandler.checkDtoNullParameter(newType);
		
		this._type = newType;
		return this;
	}
	
	public final ModuleDTO setIndicative( String newIndicative )
	{
		ExceptionHandler.checkDtoNullParameter(newIndicative);
		
		this._indicative = StringTool.applyTrim(newIndicative);
		return this;
	}
	
	// Getters
	
	public final SectionalDTO getSectional() {return this._sectional;}
	
	public final ModuleTypeDTO getType() {return this._type;}
	
	public final String getIndicative() {return this._indicative;}
	
}
