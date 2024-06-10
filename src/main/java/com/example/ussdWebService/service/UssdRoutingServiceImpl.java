package com.example.ussdWebService.service;

import org.springframework.stereotype.Service;

@Service
public class UssdRoutingServiceImpl implements UssdRoutingService {
    @Override
    public String menuLevelRouter(String sessionId, String serviceCode, String phoneNumber, String text) {
        return "";
    }
}
