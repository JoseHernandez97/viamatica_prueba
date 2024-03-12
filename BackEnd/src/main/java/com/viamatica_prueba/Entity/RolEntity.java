package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rol")
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer idRol;

    @Column(length = 50)
    @Getter
    @Setter
    private String RolName;

    @OneToMany(mappedBy = "rolEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RolUsuariosEntity> rolesUsuarios = new ArrayList<>();

    @OneToMany(mappedBy = "rolEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rol_RolOpciones> rolOpciones = new ArrayList<>();

}
