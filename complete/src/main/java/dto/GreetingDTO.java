package dto;

import org.springframework.stereotype.Component;

@Component
public class GreetingDTO {

    private String firstName;
    private String lastName;

    public GreetingDTO() {}

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }


    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
}
