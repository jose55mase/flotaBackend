package com.autobuses.flota.interfazDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobuses.flota.modelo.Usuario;



public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

	Usuario usaurio(Usuario usuario);
}
