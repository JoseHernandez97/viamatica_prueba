package com.viamatica_prueba.Service;

import com.viamatica_prueba.Entity.UsersEntity;
import com.viamatica_prueba.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {


    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }

    public List<UsersEntity> getAllUsers() {
        return usersRepository.findAll();
    }

    public UsersEntity getUserById(Integer id) {
        return usersRepository.findById(id).orElse(null);
    }

    public UsersEntity createUser(UsersEntity user) {
        return usersRepository.save(user);
    }

    public UsersEntity updateUser(Integer id, UsersEntity user) {
        UsersEntity existingUser = usersRepository.findById(id).orElse(null);
        if (existingUser != null) {
            user.setIdUsuario(id);
            return usersRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Integer id) {
        usersRepository.deleteById(id);
    }
}

