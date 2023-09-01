package com.sebastian.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Celular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long id_celular;
	private String nombre;
	private String marca;
	private Date anio;
	private String ram;
	private String procesador;
	private String desccripcion;
	
	public Celular() {
		super();
	}

	public Celular(Long id_celular, String nombre, String marca, Date anio, String ram, String procesador,
			String desccripcion) {
		super();
		this.id_celular = id_celular;
		this.nombre = nombre;
		this.marca = marca;
		this.anio = anio;
		this.ram = ram;
		this.procesador = procesador;
		this.desccripcion = desccripcion;
	}

	public Long getId_celular() {
		return id_celular;
	}

	public void setId_celular(Long id_celular) {
		this.id_celular = id_celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getAnio() {
		return anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getDesccripcion() {
		return desccripcion;
	}

	public void setDesccripcion(String desccripcion) {
		this.desccripcion = desccripcion;
	}
	
	
	
	

}
