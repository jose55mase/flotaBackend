package com.autobuses.flota.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="prueba")
@Access(AccessType.FIELD)
public class Usuario {
	
	@Column(name = "id", nullable= false ,length = 200)
	int id;
	
	@Column(name = "nombre", nullable= false ,length = 200)
	String nombre;	
	
	@Column(name = "usuario", nullable= false ,length = 200)
	String usuario;
	
	@Column(name = "clave", nullable= false ,length = 200)
	String clave;
	
	@Column(name = "rol", nullable= false ,length = 200)
	String rol;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
