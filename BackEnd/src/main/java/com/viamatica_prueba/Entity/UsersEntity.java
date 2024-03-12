package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer idUsuario;

    @Getter
    @Setter
    @Column(length = 50)
    private String Username;

    @Getter
    @Setter
    @Column(length = 50)
    private String Password;

    @Getter
    @Setter
    @Column(length = 120)
    private String Email;

    @Getter
    @Setter
    @Column(length = 1)
    private Character SessionActive;

    @Getter
    @Setter
    private Integer Persona_id;

    @Getter
    @Setter
    @Column(length = 20)
    private Character Status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Persona_id", insertable = false, updatable = false)
    private PersonEntity personEntity;

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SessionEntity> sessions = new ArrayList<>();

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RolUsuariosEntity> roles = new ArrayList<>();
}
