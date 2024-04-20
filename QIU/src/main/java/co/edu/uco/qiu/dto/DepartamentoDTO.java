package co.edu.uco.qiu.dto;

import java.util.UUID;

public class DepartamentoDTO {
	
	private UUID id;
	private String name;
	private PaisDTO country;
	
	public DepartamentoDTO()
	{
		super();
	}
	
	public DepartamentoDTO( final UUID id, final String name, final PaisDTO country )
	{
		setId(id);
		setName(name);
		setCountry(country);
	}
	
	public static final DepartamentoDTO build()
	{
		return new DepartamentoDTO();
	}
	
	public final DepartamentoDTO setId( final UUID newId ) {
		
		this.id = newId;
		return this;
	}
	
	public final UUID getId() {
		
		return this.id;
	}
	
	public final DepartamentoDTO setName( final String newName ) {
		
		this.name = newName;
		return this;
	}
	
	public final String getName() {
		
		return this.name;
	}
	
	public final DepartamentoDTO setCountry( final PaisDTO newCountry ) {
		
		this.country = newCountry;
		return this;
	}
	
	public final PaisDTO getCountry() {
		
		return this.country;
	}

}
