package com.TechODex.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "id_gen")
    @GenericGenerator(name="id_gen", strategy = "increment")
    @Column(name="ID")
    private Long id;

    @Column(name="e_id")
    private String eId;

    @Column(name="password")
    private String password;

    public User() {}

    public Long getId() { return id; }
    public String geteId() { return eId; }
    public String getPassword() { return password; }


    public void setId(Long id) { this.id = id; }
    public void seteId(String eId) { this.eId = eId; }
    public void setPassword(String password) { this.password = password;}
}
