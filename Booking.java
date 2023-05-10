/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author yibei
 */
public class Booking extends cars {
    private String location;
    private String pickupDate;
    private String pickupTime;
    private String dropoffDate;
    private String dropoffTime;
    private String adminStatus;
    private String paymentStatus;
    private String carStatus;
    private String username;
    private String carPlate;
    private double totalPrice;
    private String cusConfirmation;
    
    public Booking() {
        location = "";
        pickupDate = "";
        pickupTime = "";
        dropoffDate = "";
        dropoffTime = "";
        adminStatus = "";
        paymentStatus = "";
        carStatus = "";
        username = "";
        carPlate = "";
        totalPrice = 0;
        cusConfirmation = "";
    }

    public Booking(String carID, String carBrand, String carName, String location, String pickupDate, String pickupTime, String dropoffDate, String dropoffTime, String adminStatus, String paymentStatus, String carStatus, String username, String carPlate,double carPrice, double totalPrice, String cusConfirmation) {
        super(carID,carBrand,carName,carPrice);
        this.location = location;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;
        this.dropoffDate = dropoffDate;
        this.dropoffTime = dropoffTime;
        this.adminStatus = adminStatus;
        this.paymentStatus = paymentStatus;
        this.carStatus = carStatus;
        this.username = username;
        this.carPlate = carPlate;
        this.totalPrice = totalPrice;
        this.cusConfirmation = cusConfirmation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getDropoffDate() {
        return dropoffDate;
    }

    public void setDropoffDate(String dropoffDate) {
        this.dropoffDate = dropoffDate;
    }

    public String getDropoffTime() {
        return dropoffTime;
    }

    public void setDropoffTime(String dropoffTime) {
        this.dropoffTime = dropoffTime;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCusConfirmation() {
        return cusConfirmation;
    }

    public void setCusConfirmation(String cusConfirmation) {
        this.cusConfirmation = cusConfirmation;
    }



    @Override
    public String toString() {
        return carID + "," + carBrand + "," + carName + "," + location + "," + pickupDate + "," + pickupTime + "," + dropoffDate + "," + dropoffTime + ","
                        + adminStatus + "," + paymentStatus + "," + carStatus + "," + username + "," + carPlate + "," + carPrice + "," + totalPrice + "," + cusConfirmation;
    }
    
    
    
}
