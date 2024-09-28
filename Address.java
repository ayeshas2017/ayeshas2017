public class Address {
    private String street;
    private String city;
    private String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getStreet(){
        return street;
    }
    public String getPostalCode(){
        return postalCode ;
    }
    public String getCity(){
        return city;
    }
    public void displayAddress(){
        System.out.println("Street:"+street );
        System.out.println("City :"+city);
        System.out.println("postalCode:"+postalCode);
    }

}
