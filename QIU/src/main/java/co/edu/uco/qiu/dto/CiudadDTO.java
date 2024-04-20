package co.edu.uco.qiu.dto;

import java.util.UUID;

public class CiudadDTO {
	
	private UUID id;
	private String name;
	private DepartamentoDTO department;
	
	public CiudadDTO()
	{
		super();
	}
	
	public CiudadDTO( final UUID id, final String name, final DepartamentoDTO dep )
	{
		setId(id);
		setName(name);
		setDepartment(dep);
	}
	
	public static final CiudadDTO build()
	{
		return new CiudadDTO();
	}
	
	public final CiudadDTO setId( final UUID newId ) {
		
		this.id = newId;
		return this;
	}
	
	public final UUID getId() {
		
		return this.id;
	}
	
	public final CiudadDTO setName( final String newName ) {
		
		this.name = newName;
		return this;
	}
	
	public final String getName() {
		
		return this.name;
	}
	
	public final CiudadDTO setDepartment( final DepartamentoDTO newDepartment ) {
		
		this.department = newDepartment;
		return this;
	}
	
	public final DepartamentoDTO getDepartment() {
		
		return this.department;
	}

}
