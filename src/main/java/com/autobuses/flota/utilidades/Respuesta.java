package com.autobuses.flota.utilidades;

public class Respuesta {
	private Integer respuestaCdigo;
	private String mensage;
	
	public Respuesta(Integer respuestaCdigo) {
		super();
		this.respuestaCdigo = respuestaCdigo;
	}

	public Respuesta(Integer respuestaCdigo, String mensage) {
		super();
		this.respuestaCdigo = respuestaCdigo;
		this.mensage = mensage;
	}
	
	
	//respuesta de codigo
	public Integer getRespuestaCdigo() {
		return respuestaCdigo;
	}
	public void setRespuestaCdigo(Integer respuestaCdigo) {
		this.respuestaCdigo = respuestaCdigo;
	}
	
	//respuesta de mendage
	public String getMensage() {
		return mensage;
	}
	public void setMensage(String mensage) {
		this.mensage = mensage;
	}
	

}
