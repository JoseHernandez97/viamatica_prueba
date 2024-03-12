package com.viamatica_prueba.Controller;

import com.viamatica_prueba.Entity.RolEntity;
import com.viamatica_prueba.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {


    private final RolService rolService;

    @Autowired
    public RolController (RolService rolService){
        this.rolService=rolService;
    }

    @GetMapping
    public List<RolEntity> getAllRoles() {
        return rolService.getAllRoles();
    }

    @GetMapping("/{id}")
    public RolEntity getRoleById(@PathVariable Integer id) {
        return rolService.getRoleById(id);
    }

    @PostMapping
    public RolEntity createRole(@RequestBody RolEntity role) {
        return rolService.createRole(role);
    }

    @PutMapping("/{id}")
    public RolEntity updateRole(@PathVariable Integer id, @RequestBody RolEntity role) {
        return rolService.updateRole(id, role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id) {
        rolService.deleteRole(id);
    }
}

