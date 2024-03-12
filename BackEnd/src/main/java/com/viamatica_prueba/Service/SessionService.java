package com.viamatica_prueba.Service;

import com.viamatica_prueba.Entity.SessionEntity;
import com.viamatica_prueba.Repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {


    private final SessionRepository sessionRepository;

    @Autowired
    public SessionService (SessionRepository sessionRepository){
        this.sessionRepository=sessionRepository;
    }

    public List<SessionEntity> getAllSessions() {
        return sessionRepository.findAll();
    }

    public SessionEntity getSessionById(Integer id) {
        return sessionRepository.findById(id).orElse(null);
    }

    public SessionEntity createSession(SessionEntity session) {
        return sessionRepository.save(session);
    }

    public SessionEntity updateSession(Integer id, SessionEntity updatedSession) {
        Optional<SessionEntity> existingSessionOptional = sessionRepository.findById(id);
        if (existingSessionOptional.isPresent()) {
            SessionEntity existingSession = existingSessionOptional.get();
            updatedSession.setId(existingSession.getId());
            return sessionRepository.save(updatedSession);
        }
        return null;
    }

    public void deleteSession(Integer id) {
        sessionRepository.deleteById(id);
    }
}

