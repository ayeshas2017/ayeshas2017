public class Person {
    private String name;
   private  String contactNumber;

public Person(String name, String contactNumber) {
    this.name = name;
    this.contactNumber = contactNumber;
}
public void setContactNumber(String contactNumber){
    this.contactNumber= contactNumber;
}
public String getContactNumber(){
    return contactNumber;
}
public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void display(){
    System.out.println("name :" +name);
    System.out.println("contact :"+contactNumber);
}
}