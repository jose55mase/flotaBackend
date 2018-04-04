package com.autobuses.flota.servisios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.interfazDao.UsuarioRepositorio;

@Service
public class UsuarioServisiosImplementar implements UsuariosServisios {
	
	@Autowired
	protected UsuarioRepositorio usuarioRepositorio;
}
