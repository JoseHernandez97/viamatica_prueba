package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rol_rolopviones")
public class Rol_RolOpciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private Integer Rol_idRol;

    @Getter
    @Setter
    private Integer RolOpciones_idOpcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Rol_idRol", insertable = false, updatable = false)
    private RolEntity rolEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RolOpciones_idOpcion", insertable = false, updatable = false)
    private RolOpcionesEntity rolOpcionesEntity;



}
