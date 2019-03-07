package com.ibm.crud.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.Currency;

@Entity
@Table(name = "consumo")
public class Consumo {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date fechaConsumo;
	
	private String Descripcion;
	

	private double  monto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarjeta")
	private Tarjeta tarjeta;
	
	
	
	public Consumo( Date fechaConsumo, String descripcion, double monto) {
		super();
		this.fechaConsumo = fechaConsumo;
		Descripcion = descripcion;
		this.monto = monto;
		
	}


	public Tarjeta getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFechaConsumo() {
		return fechaConsumo;
	}


	public void setFechaConsumo(Date fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public String toString() {
		return "Consumo [id=" + id + ", fechaConsumo=" + fechaConsumo + ", Descripcion=" + Descripcion + ", monto="
				+ monto + "]";
	}
	
	
	
	
	
	
	
	
	

}
