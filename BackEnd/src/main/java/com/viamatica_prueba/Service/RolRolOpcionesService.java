package com.viamatica_prueba.Service;

import com.viamatica_prueba.Entity.Rol_RolOpciones;
import com.viamatica_prueba.Repository.RolRolOpcionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolRolOpcionesService {

    @Autowired
    private RolRolOpcionesRepository rolRolOpcionesRepository;

    public List<Rol_RolOpciones> getAllRolRolOpciones() {
        return rolRolOpcionesRepository.findAll();
    }

    public Rol_RolOpciones createRolRolOpciones(Rol_RolOpciones rolRolOpciones) {
        return rolRolOpcionesRepository.save(rolRolOpciones);
    }

    public Rol_RolOpciones updateRolRolOpciones(Integer id, Rol_RolOpciones updatedRolRolOpciones) {
        Optional<Rol_RolOpciones> existingRolRolOpcionesOptional = rolRolOpcionesRepository.findById(id);
        if (existingRolRolOpcionesOptional.isPresent()) {
            Rol_RolOpciones existingRolRolOpciones = existingRolRolOpcionesOptional.get();
            updatedRolRolOpciones.setId(existingRolRolOpciones.getId()); // Set the ID to ensure the update on the same entity
            return rolRolOpcionesRepository.save(updatedRolRolOpciones);
        }
        return null;
    }

    public void deleteRolRolOpciones(Integer id) {
        rolRolOpcionesRepository.deleteById(id);
    }
}

