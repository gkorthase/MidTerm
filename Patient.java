
/**
 * @author gkorthase@gmail.com
 * @version 03.09.2015.01
 * Assignment: MidTerm
 * Purpose: Creating patient information for ski patrol.
 */

public class Patient {
    private int iD, age, counter;
    private String firstName, lastName, address;

    /**
     * Enter patient information, ID must be 5 digits.
     */
    public Patient(String firstName, String lastName, int iD, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;
        this.age = age;
        this.address = address;
    }

    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getID() {
        return iD;
    }
}
