package com.TechODex.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(generator = "id_gen")
    @GenericGenerator(name="id_gen", strategy = "increment")
    @Column(name="ID")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="e_id")
    private String eId;

    @Column(name="tech")
    private String tech;

    public Registration() {}

    public Registration(String t) {
        tech = t;
    }

    public Long getID() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String geteId() { return eId; }
    public String getTech() { return tech; }

    public void setID(Long id){ this.id = id; }
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void seteId(String eId) { this.eId = eId;}
    public void setTech(String tech) { this.tech = tech; }
}
