package com.viamatica_prueba.Repository;

import com.viamatica_prueba.Entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Integer> {
}

