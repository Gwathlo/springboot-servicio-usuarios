package com.formacionbdi.springboot.app.usuarios.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.formacionbdi.springboot.app.commons.usuarios.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@RestResource(path = "buscar-username")
	public Usuario findByUsername(@Param("username") String username);
	
	@Query("select u from Usuario u where u.username = ?1")
	public Usuario obtenerPorUsername(String username);

}
