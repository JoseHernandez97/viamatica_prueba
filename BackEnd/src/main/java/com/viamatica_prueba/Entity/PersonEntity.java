package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer idPersona;

    @Getter
    @Setter
    @Column(length = 60)
    private String Nombres;

    @Getter
    @Setter
    @Column(length = 60)
    private String Apellidos;

    @Getter
    @Setter
    @Column(length = 10)
    private String Identificacion;

    @Getter
    @Setter
    private Timestamp FechaNacimiento;

    @OneToMany(mappedBy = "personEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UsersEntity> users = new ArrayList<>();


}
