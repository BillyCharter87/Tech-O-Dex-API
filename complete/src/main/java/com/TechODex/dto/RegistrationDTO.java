package com.TechODex.dto;

public class RegistrationDTO {

    private String firstName;
    private String lastName;

    public RegistrationDTO() {}

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }


    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
}
