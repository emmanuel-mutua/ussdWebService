package com.example.ussdWebService.data;


import com.example.ussdWebService.enums.MenuOptionAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MenuOption {
    private String type; // helps to determine if the next step should return a response or serve a different menu
    private String response;
    @JsonProperty("next_menu_level") private String nextMenuLevel; //menu return level if return is a menu
    private MenuOptionAction action; // action router .i.e. What process should be performed to retrieve the correct set of data for display
}


