package com.viamatica_prueba.Controller;

import com.viamatica_prueba.Entity.SessionEntity;
import com.viamatica_prueba.Service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {


    private final SessionService sessionService;

    @Autowired
    public SessionController (SessionService sessionService){
        this.sessionService=sessionService;
    }

    @GetMapping
    public List<SessionEntity> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public SessionEntity getSessionById(@PathVariable Integer id) {
        return sessionService.getSessionById(id);
    }

    @PostMapping
    public SessionEntity createSession(@RequestBody SessionEntity session) {
        return sessionService.createSession(session);
    }

    @PutMapping("/{id}")
    public SessionEntity updateSession(@PathVariable Integer id, @RequestBody SessionEntity updatedSession) {
        return sessionService.updateSession(id, updatedSession);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Integer id) {
        sessionService.deleteSession(id);
    }
}

