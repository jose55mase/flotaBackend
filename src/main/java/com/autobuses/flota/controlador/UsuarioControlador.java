package com.autobuses.flota.controlador;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.autobuses.flota.servisios.UsuariosServisios;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.autobuses.flota.modelo.Usuario;
import com.autobuses.flota.utilidades.Respuesta;


public class UsuarioControlador {
	
	protected UsuariosServisios usuariosServisios;

	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public Respuesta saveOrUpdate(@RequestBody String usuarioJson)
	throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		Usuario usuario = this.mapper.readValue(usuarioJson, Usuario.class);
		this.usuariosServisios.save(usuario);	
		
		
		return null;
		
		
	}
	
}
