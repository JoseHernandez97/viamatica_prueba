package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rol_usuarios")
public class RolUsuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private Integer Rolid;

    @Getter
    @Setter
    private Integer  Usuarioid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Rolid", insertable = false, updatable = false)
    private RolEntity rolEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Usuarioid", insertable = false, updatable = false)
    private UsersEntity usersEntity;
}
