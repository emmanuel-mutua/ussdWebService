package com.example.ussdWebService.data;


import com.example.ussdWebService.enums.MenuOptionAction;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuOption {
    private String type; // helps to determine if the next step should return a response or serve a different menu
    private String response;
    @JsonProperty("menu_next_level") private String menuNextLevel; //menu return level if return is a menu
    private MenuOptionAction action; // action router .i.e. What process should be performed to retrieve the correct set of data for display
}


