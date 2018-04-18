package dto;

public class GreetingDTO {

    private String firstName;
    private String lastName;

    public GreetingDTO() {}

    public String getfName() {
        return this.firstName;
    }
    public String getlName() {
        return this.lastName;
    }


    public void setFName(String s){ this.firstName = s; }
    public void setLName(String s){ this.lastName = s; }
}
