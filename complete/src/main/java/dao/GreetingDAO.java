package dao;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingDAO {

    private String firstName;
    private String lastName;

    public GreetingDAO() {}

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }


    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
}

