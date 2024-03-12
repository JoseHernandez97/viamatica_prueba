package com.viamatica_prueba.Service;

import com.viamatica_prueba.Entity.RolEntity;
import com.viamatica_prueba.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {


    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository){
        this.rolRepository=rolRepository;
    }

    public List<RolEntity> getAllRoles() {
        return rolRepository.findAll();
    }

    public RolEntity getRoleById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    public RolEntity createRole(RolEntity role) {
        return rolRepository.save(role);
    }

    public RolEntity updateRole(Integer id, RolEntity role) {
        RolEntity existingRole = rolRepository.findById(id).orElse(null);
        if (existingRole != null) {
            role.setIdRol(id);
            return rolRepository.save(role);
        }
        return null;
    }

    public void deleteRole(Integer id) {
        rolRepository.deleteById(id);
    }
}

