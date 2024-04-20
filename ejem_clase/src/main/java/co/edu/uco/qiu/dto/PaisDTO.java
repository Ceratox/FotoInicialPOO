package co.edu.uco.qiu.dto;

import java.util.UUID;

import co.edu.uco.qiu.crosscutting.helpers.TextHelper;

public final class PaisDTO {

	private UUID id;
	private String name;
	
	public PaisDTO()
	{
		super();
	}
	
	public PaisDTO( final UUID id, final String name ) 
	{
		setId(id);
		setName(name);
	}
	
	public static final PaisDTO build()
	{
		return new PaisDTO();
	}
	
	public final PaisDTO setId( final UUID newId ) {
		
		this.id = newId;
		return this;
	}
	
	public final UUID getId() {
		
		return this.id;
	}
	
	public final PaisDTO setName( final String newName ) {
		
		this.name = TextHelper.applyTrim(newName);
		
		return this;
	}
	
	public final String getName() {
		
		return this.name;
	}
	
	public static void main(String[] args)
	{
		PaisDTO p = PaisDTO.build().setName("Colombia");
	}
}
