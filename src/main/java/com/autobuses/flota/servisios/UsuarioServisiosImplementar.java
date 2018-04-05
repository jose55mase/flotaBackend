package com.autobuses.flota.servisios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.interfazDao.UsuarioRepositorio;
import com.autobuses.flota.modelo.Usuario;

@Service
public class UsuarioServisiosImplementar implements UsuariosServisios {
	
	@Autowired
	protected UsuarioRepositorio usuarioRepositorio;

	@Override
	public Usuario save(Usuario usuario) {
		return this.usuarioRepositorio.save(usuario);
	}
}
