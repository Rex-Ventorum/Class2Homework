package class2homework;

public class Class2Homework {

    public static void main(String[] args) {
        Person johnObject = new Person();
        johnObject.setFirstName("John");
        johnObject.setLastName("Smith");
        johnObject.setAge(30);
        
        Person maryObject = new Person();
        maryObject.setFirstName("Mary");
        maryObject.setLastName("Smith");
        maryObject.setAge(28);
        
        System.out.println(johnObject.getFullName() + " is " + johnObject.getAge() + " years old");
        System.out.println(maryObject.getFullName() + " is " + maryObject.getAge() + " years old");   
    }
    
}
