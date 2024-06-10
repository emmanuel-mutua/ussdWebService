package com.example.ussdWebService.service;

public interface UssdRoutingService
{
    String menuLevelRouter(String sessionId, String serviceCode, String phoneNumber, String text);
}
