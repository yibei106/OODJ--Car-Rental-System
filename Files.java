/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;

/**
 *
 * @author yibei
 */
public class Files {

    public static void systemlog(String username, boolean status) throws IOException {
        FileWriter fw = new FileWriter("systemlog.txt", true);
        if (status == TRUE) {
            fw.write(username + "," + "successful" + "," + java.time.LocalDate.now() + "," + java.time.LocalTime.now());
            fw.write(System.getProperty("line.separator"));
        } else {
            fw.write(username + "," + "failed" + "," + java.time.LocalDate.now() + "," + java.time.LocalTime.now());
        }
        fw.write(System.getProperty("line.separator"));

        fw.close();
    }

    public static ArrayList<Booking> readBooking() throws FileNotFoundException, IOException {
        ArrayList<Booking> list = new ArrayList<>();
        FileReader file = new FileReader("cusbooking.txt");
        BufferedReader br = new BufferedReader(file);
        String line;
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");
            String carID = info[0];
            String carBrand = info[1];
            String carName = info[2];
            String location = info[3];
            String pickupDate = info[4];
            String pickupTime = info[5];
            String dropoffDate = info[6];
            String dropoffTime = info[7];
            String adminStatus = info[8];
            String paymentStatus = info[9];
            String carStatus = info[10];
            String username = info[11];
            String carPlate = info[12];
            String carprice = info[13];
            Double carPrice = Double.valueOf(carprice);
            String totalprice = info[14];
            Double totalPrice = Double.valueOf(totalprice);
            String cusConfirmation = info[15];
            list.add(new Booking(carID, carBrand, carName, location, pickupDate, pickupTime, dropoffDate, dropoffTime, adminStatus, paymentStatus, carStatus, username,
                    carPlate, carPrice, totalPrice, cusConfirmation));
        }
        return list;
    }

    public static ArrayList<Admin> readAdmin() throws FileNotFoundException, IOException {
        ArrayList<Admin> list = new ArrayList<>();
        FileReader fr = new FileReader("admin.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] info;
        while ((line = br.readLine()) != null) {
            info = line.split(",");
            String username = info[0];
            String password = info[1];
            list.add(new Admin(username, password));
        }
        return list;
    }

    public static ArrayList<cars> displayCars() throws FileNotFoundException {
        ArrayList<cars> list = new ArrayList<>();
        FileReader file = new FileReader("carinfo.txt");
        BufferedReader reader = new BufferedReader(file);
        Object[] tableLines = reader.lines().toArray();
        for (int i = 0; i < tableLines.length; i++) {
            String line = tableLines[i].toString().trim();
            String[] carInfo = line.split(",");
            String carID = carInfo[0];
            String carBrand = carInfo[1];
            String carName = carInfo[2];
            String carprice = carInfo[3];
            double carPrice = Double.valueOf(carprice);
            String carNumber = carInfo[4];
            int number = Integer.valueOf(carNumber);
            list.add(new cars(carID, carBrand, carName, carPrice, number));
        }
        return list;
    }

    public static void editBooking(ArrayList<String> tempArray,String filename) throws FileNotFoundException {
        PrintWriter pr = new PrintWriter(filename);
        for (String str : tempArray) {
            pr.println(str);
        }
        pr.close();
    }
    
    public static ArrayList<Customer> readCustomer() throws FileNotFoundException, IOException {
        ArrayList<Customer> list = new ArrayList<>();
        FileReader file = new FileReader("customerinfo.txt");
        BufferedReader br = new BufferedReader(file);
        String line;
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");
            String firstName = info[0];
            String lastName = info[1];
            String userName = info[2];
            String contactNo = info[3];
            String address = info[4];
            String password = info[5];
            list.add(new Customer(firstName, lastName, userName, contactNo, address, password));
        }
        return list;
    }
    
    
}
