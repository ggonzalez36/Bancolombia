package com.ibm.crud.Entity;
import java.util.Set;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ElementCollection(targetClass=Integer.class)
	private Set<Integer> numeroTarjeta;
	
	private int ccv;
	
	private String tipoTarjeta;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "tarjeta")
	@ElementCollection(targetClass=Consumo.class)
	private List<Consumo> Consumos;
	
	
	

	public Tarjeta() {
		super();
	}

	public Tarjeta( Set<Integer> numeroTarjeta, int ccv, String tipoTarjeta,
			List<Consumo> consumos) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.ccv = ccv;
		this.tipoTarjeta = tipoTarjeta;

		Consumos = consumos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Integer> getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Set<Integer> numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public List<Consumo> getConsumos() {
		return Consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		Consumos = consumos;
	}

	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", ccv=" + ccv + ", tipoTarjeta="
				+ tipoTarjeta + ", Consumos=" + Consumos + "]";
	}
	
	
	
	
	
	

}
