package com.example.ussdWebService.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MenuOptionAction {
    PROCESS_ACC_BALANCE("PROCESS_ACC_BALANCE"),
    PROCESS_ACC_PHONE_NUMBER("PROCESS_ACC_PHONE_NUMBER"),
    PROCESS_ACC_NUMBER("PROCESS_ACC_NUMBER");
    private String action;
    MenuOptionAction(String action) {
        this.action = action;
    }

    @JsonValue
    public String getAction() {
        return action;
    }
}
