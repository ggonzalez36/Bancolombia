package com.ibm.crud.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String direccion;
	
	private String ciudad;
	
	private Long telefono;
	  

	@OneToMany (cascade = CascadeType.ALL, mappedBy = "cliente")
	private Set<Tarjeta> tarjetas= new HashSet<>();
	
	
	
	
	


	public Cliente() {
		super();
	}

	public Cliente(String nombre, String direccion, String ciudad, Long telefono, Set<Tarjeta> tarjetas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.tarjetas = tarjetas;
	}

	public Set<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Set<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad
				+ ", telefono=" + telefono + ", tarjetas=" + tarjetas + "]";
	}

	
	
	
	


}
