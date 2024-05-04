package co.edu.uco.qiu.config.crosscutting.helpers;

import java.util.UUID;

public class MasterDTO {
	
	private UUID _code;
	
	protected MasterDTO () { super(); }
	
	public final MasterDTO setCode( UUID newCode )
	{
		this._code = newCode;
		return this;
	}
	
	public final UUID getCode() { return this._code; }

}
