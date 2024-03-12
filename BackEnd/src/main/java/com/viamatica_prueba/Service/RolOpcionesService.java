package com.viamatica_prueba.Service;

import com.viamatica_prueba.Entity.RolOpcionesEntity;
import com.viamatica_prueba.Repository.RolOpcionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolOpcionesService {


    private final RolOpcionesRepository rolOpcionesRepository;

    @Autowired
    public RolOpcionesService(RolOpcionesRepository rolOpcionesRepository){
        this.rolOpcionesRepository=rolOpcionesRepository;

    }

    public List<RolOpcionesEntity> getAllRolOpciones() {
        return rolOpcionesRepository.findAll();
    }

    public RolOpcionesEntity getRolOpcionesById(Integer id) {
        return rolOpcionesRepository.findById(id).orElse(null);
    }

    public RolOpcionesEntity createRolOpciones(RolOpcionesEntity rolOpciones) {
        return rolOpcionesRepository.save(rolOpciones);
    }

    public RolOpcionesEntity updateRolOpciones(Integer id, RolOpcionesEntity updatedRolOpciones) {
        Optional<RolOpcionesEntity> existingRolOpcionesOptional = rolOpcionesRepository.findById(id);
        if (existingRolOpcionesOptional.isPresent()) {
            RolOpcionesEntity existingRolOpciones = existingRolOpcionesOptional.get();
            updatedRolOpciones.setIdOpcion(existingRolOpciones.getIdOpcion()); // Set the ID to ensure the update on the same entity
            return rolOpcionesRepository.save(updatedRolOpciones);
        }
        return null;
    }

    public void deleteRolOpciones(Integer id) {
        rolOpcionesRepository.deleteById(id);
    }
}

