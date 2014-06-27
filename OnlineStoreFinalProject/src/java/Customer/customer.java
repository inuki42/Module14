/*
 * class that creates the customer
 */
package Customer;

/**
 *
 * @author Marc
 */
public class customer {
   private String firstname;
   private String lastname;
   private String streetAddress;
   private String address2;
   private String city;
   private String state;
   private String zipCode;
   private String phone;
   private String email;
   private String password; 
   
    
    // constructors
    public customer() {
        firstname = "";
        lastname = "";
        streetAddress = "";
        address2 = "";
        city = "";
        state = "";
        zipCode = "";
        phone = "";
        email = "";
        password = "";
    }
    
    // get methods
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getStreetAddress() { return streetAddress; }
    public String getAddress2() { return address2; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    
    
    // set methods
    public void setFirstname(String Firstname) { this.firstname = Firstname; }
    public void setLastname(String Lastname) { this.lastname = Lastname; }
    public void setStreetAddress(String StreetAddress) { this.streetAddress = StreetAddress; }
    public void setAddress2(String Address2) { this.address2 = Address2; }
    public void setCity(String City) { this.city = City; }
    public void setState(String State) { this.state = State; }
    public void setZipCode(String ZipCode) { this.zipCode = ZipCode; }
    public void setPhone(String Phone) { this.phone = Phone; }
    public void setEmail(String Email) { this.email = Email; }
    public void setPassword(String Password) { this.password = Password; }
}