package com.viamatica_prueba.Repository;

import com.viamatica_prueba.Entity.RolOpcionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolOpcionesRepository extends JpaRepository<RolOpcionesEntity, Integer> {
}

