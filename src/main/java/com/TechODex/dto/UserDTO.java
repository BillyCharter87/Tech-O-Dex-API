package com.TechODex.dto;


public class UserDTO {


    private Long id;
    private String eId;
    private String password;

    public UserDTO() {}

    public Long getId() { return id; }
    public String geteId() { return eId; }
    public String getPassword() { return password; }


    public void setId(Long id) { this.id = id; }
    public void seteId(String eId) { this.eId = eId; }
    public void setPassword(String password) { this.password = password;}
}
