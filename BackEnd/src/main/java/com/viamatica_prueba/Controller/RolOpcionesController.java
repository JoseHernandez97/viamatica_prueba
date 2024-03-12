package com.viamatica_prueba.Controller;

import com.viamatica_prueba.Entity.RolOpcionesEntity;
import com.viamatica_prueba.Service.RolOpcionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rolopciones")
public class RolOpcionesController {


    private final RolOpcionesService rolOpcionesService;

    @Autowired
    public RolOpcionesController(RolOpcionesService rolOpcionesService){
        this.rolOpcionesService=rolOpcionesService;
    }
    @GetMapping
    public List<RolOpcionesEntity> getAllRolOpciones() {
        return rolOpcionesService.getAllRolOpciones();
    }

    @GetMapping("/{id}")
    public RolOpcionesEntity getRolOpcionesById(@PathVariable Integer id) {
        return rolOpcionesService.getRolOpcionesById(id);
    }

    @PostMapping
    public RolOpcionesEntity createRolOpciones(@RequestBody RolOpcionesEntity rolOpciones) {
        return rolOpcionesService.createRolOpciones(rolOpciones);
    }

    @PutMapping("/{id}")
    public RolOpcionesEntity updateRolOpciones(@PathVariable Integer id, @RequestBody RolOpcionesEntity updatedRolOpciones) {
        return rolOpcionesService.updateRolOpciones(id, updatedRolOpciones);
    }

    @DeleteMapping("/{id}")
    public void deleteRolOpciones(@PathVariable Integer id) {
        rolOpcionesService.deleteRolOpciones(id);
    }
}

