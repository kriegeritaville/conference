package com.kriegerations.conference.model;

//import jakarta.validation.constraints.NotEmpty;

import javax.validation.constraints.NotEmpty;

public class Registration {

    @NotEmpty(message="Name may not be empty")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
