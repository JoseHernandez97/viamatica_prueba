package com.viamatica_prueba.Repository;

import com.viamatica_prueba.Entity.Rol_RolOpciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRolOpcionesRepository extends JpaRepository<Rol_RolOpciones, Integer> {
}

