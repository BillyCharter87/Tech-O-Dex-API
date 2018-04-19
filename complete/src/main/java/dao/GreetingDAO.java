package dao;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingDAO {

    private String firstName;
    private String lastName;

    public GreetingDAO() {}

    public String getfName() {
        return this.firstName;
    }
    public String getlName() {
        return this.lastName;
    }


    public void setFName(String s){ this.firstName = s; }
    public void setLName(String s){ this.lastName = s; }
}

