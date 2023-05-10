/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author yibei
 */
public class cars {
    String carID;
    String carBrand;
    String carName;
    double carPrice;
    private int number;
    private String date;
    private String time;
    
    public cars() {
        carID = "";
        carBrand = "";
        carName = "";
        carPrice = 0;
        number = 0;
        date = "";
        time = "";
    }

    public cars(String carID, String carBrand, String carName, double price, int number, String date, String time) {
        this.carID = carID;
        this.carBrand = carBrand;
        this.carName = carName;
        this.carPrice = carPrice;
        this.number = number;
        this.date = date;
        this.time = time;
    }
    
    public cars(String carID, String carBrand, String carName, double carPrice) {
        this.carID = carID;
        this.carBrand = carBrand;
        this.carName = carName;
        this.carPrice = carPrice;
    }
    
    public cars(String carID, String carBrand, String carName, double carPrice, int number) {
        this.carID = carID;
        this.carBrand = carBrand;
        this.carName = carName;
        this.carPrice = carPrice;
        this.number = number;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return carID + "," + carBrand + "," + carName + "," + carPrice + "," + number + "," + date + "," + time;
    }
    
    
    
    
}
