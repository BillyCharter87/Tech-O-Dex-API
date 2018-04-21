package model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "GREETING")
public class Greeting {

    @Id
    @GeneratedValue(generator = "id_gen")
    @GenericGenerator(name="id_gen", strategy = "increment")
    @Column(name="ID")
    private int id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    public Greeting() {}

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }

    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
}
