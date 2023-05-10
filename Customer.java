/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author yibei
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private String contactNo;
    private String address;
    private String password;
    
    public Customer() {
        firstName = "";
        lastName = "";
        username = "";
        contactNo = "";
        address = "";
        password = "";
    }

    public Customer(String firstName, String lastName, String username, String contactNo, String address, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.contactNo = contactNo;
        this.address = address;
        this.password = password;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + username + "," + contactNo + "," + address + "," + password;
    }
    
    
}
