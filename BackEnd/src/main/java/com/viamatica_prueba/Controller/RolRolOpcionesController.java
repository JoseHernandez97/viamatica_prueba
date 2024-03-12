package com.viamatica_prueba.Controller;

import com.viamatica_prueba.Entity.Rol_RolOpciones;
import com.viamatica_prueba.Service.RolRolOpcionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rolrolopciones")
public class RolRolOpcionesController {

    @Autowired
    private RolRolOpcionesService rolRolOpcionesService;

    @GetMapping
    public List<Rol_RolOpciones> getAllRolRolOpciones() {
        return rolRolOpcionesService.getAllRolRolOpciones();
    }

    @PostMapping
    public Rol_RolOpciones createRolRolOpciones(@RequestBody Rol_RolOpciones rolRolOpciones) {
        return rolRolOpcionesService.createRolRolOpciones(rolRolOpciones);
    }

    @PutMapping("/{id}")
    public Rol_RolOpciones updateRolRolOpciones(@PathVariable Integer id, @RequestBody Rol_RolOpciones updatedRolRolOpciones) {
        return rolRolOpcionesService.updateRolRolOpciones(id, updatedRolRolOpciones);
    }

    @DeleteMapping("/{id}")
    public void deleteRolRolOpciones(@PathVariable Integer id) {
        rolRolOpcionesService.deleteRolRolOpciones(id);
    }
}

