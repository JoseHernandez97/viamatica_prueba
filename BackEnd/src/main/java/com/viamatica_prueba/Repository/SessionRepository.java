package com.viamatica_prueba.Repository;
import com.viamatica_prueba.Entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<SessionEntity, Integer> {
}

