package com.viamatica_prueba.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Length;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rolopciones")
public class RolOpcionesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    @Getter
    @Setter
    private Integer idOpcion;

    @Column(length = 50)
    @Getter
    @Setter
    private String NombreOpcion;

    @OneToMany(mappedBy = "rolOpcionesEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rol_RolOpciones> roles = new ArrayList<>();
}
