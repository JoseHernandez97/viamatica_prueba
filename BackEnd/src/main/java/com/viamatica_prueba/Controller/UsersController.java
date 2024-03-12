package com.viamatica_prueba.Controller;

import com.viamatica_prueba.Entity.UsersEntity;
import com.viamatica_prueba.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController (UsersService usersService){
        this.usersService=usersService;
    }

    @GetMapping
    public List<UsersEntity> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UsersEntity getUserById(@PathVariable Integer id) {
        return usersService.getUserById(id);
    }

    @PostMapping
    public UsersEntity createUser(@RequestBody UsersEntity user) {
        return usersService.createUser(user);
    }

    @PutMapping("/{id}")
    public UsersEntity updateUser(@PathVariable Integer id, @RequestBody UsersEntity user) {
        return usersService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        usersService.deleteUser(id);
    }
}

