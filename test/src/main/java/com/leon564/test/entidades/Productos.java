package com.leon564.test.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Productos")

public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public int IdProductos;
	
	@JoinColumn(name = "IdCategoria_FK")
	@ManyToOne(fetch = FetchType.EAGER)
	public Categoria IdCategoria_FK;
	
	public String nombre;
	public String descripcion;
	
	public Productos() {
		super();
	}
	public Productos(int idProductos, Categoria idCategoria_FK, String nombre, String descripcion) {
		super();
		IdProductos = idProductos;
		IdCategoria_FK = idCategoria_FK;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getIdProductos() {
		return IdProductos;
	}
	public void setIdProductos(int idProductos) {
		IdProductos = idProductos;
	}
	public Categoria getIdCategoria_FK() {
		return IdCategoria_FK;
	}
	public void setIdCategoria_FK(Categoria idCategoria_FK) {
		IdCategoria_FK = idCategoria_FK;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
