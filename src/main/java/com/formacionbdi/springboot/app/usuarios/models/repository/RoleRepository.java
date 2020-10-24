package com.formacionbdi.springboot.app.usuarios.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
