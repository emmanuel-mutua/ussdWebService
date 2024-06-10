package com.example.ussdWebService.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Menu {

    /**
     * @param menuOptions: options available for this menu level
     * @param text: text to return for a certain level
     * @param maxSelections selection identifier to enable diferentiation between value provided and option selections i.e if request data is greater than maxSelections then it is determined that that is an input.
     *
     */
    @JsonProperty("id") private String id;
    @JsonProperty("menu_level") private String menuLevel;
    @JsonProperty("text") private String text;
    @JsonProperty("menu_options") private List<MenuOption> menuOptions;
    @JsonProperty("max_selections") private Integer maxSelections;

}
