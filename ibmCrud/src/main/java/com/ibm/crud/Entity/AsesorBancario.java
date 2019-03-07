package com.ibm.crud.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AsesorBancario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String especialidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "AsesorBancario [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + "]";
	}
	
	
	
	

}
