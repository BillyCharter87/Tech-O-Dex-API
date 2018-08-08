package com.TechODex.dto;

public class RegistrationDTO {

    private String firstName;
    private String lastName;
    private String eId;
    private String tech;

    public RegistrationDTO() {}

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String geteId() { return eId; }
    public String getTech() { return tech; }

    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void seteId(String eId) { this.eId = eId;}
    public void setTech(String tech) { this.tech = tech; }
}
