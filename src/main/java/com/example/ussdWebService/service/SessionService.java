package com.example.ussdWebService.service;

import com.example.ussdWebService.data.UssdSession;
import com.example.ussdWebService.repositories.UssdSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * This is the session management service
 */
@Service
@RequiredArgsConstructor
public class SessionService {
    private final UssdSessionRepository sessionRepository;
    public UssdSession createUssdSession(UssdSession session) {
        return sessionRepository.save(session);
    }

    public UssdSession get(String sessionId) {
        return sessionRepository.findById(sessionId).orElse(null);
    }

    public UssdSession update(UssdSession session) {
        if(sessionRepository.existsById(session.getId())) {
            return sessionRepository.save(session);
        }
        throw new IllegalArgumentException("A session must have an id to be updated");
    }
    public void delete(String sessionId) {
        sessionRepository.deleteById(sessionId);
    }
}
