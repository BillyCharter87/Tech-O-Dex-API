package dto;

public class GreetingDTO {

    private String fName;
    private String lName;

    public GreetingDTO() {}

    public String getfName() {
        return this.fName;
    }
    public String getlName() {
        return this.lName;
    }


    public void setFName(String s){ this.fName = s; }
    public void setLName(String s){ this.lName = s; }
}
