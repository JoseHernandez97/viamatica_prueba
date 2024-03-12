package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "sessions")
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private Timestamp FechaIngreso;

    @Getter
    @Setter
    private Timestamp FechaCierre;

    @Getter
    @Setter
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    private UsersEntity usersEntity;
}
