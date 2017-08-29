package class2homework;

public class Person {

    private String firstName;
    private String lastName;
    private int age; 
    
    //------------------------//
    //---- GETTER METHODS ----//
    //------------------------//
    
    public String getFirstName() {return firstName;}
    public String getLastName() { return lastName;}
    public int getAge() { return age;}

    //------------------------//
    //---- SETTER METHODS ----//
    //------------------------//
    
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age;}    
}
