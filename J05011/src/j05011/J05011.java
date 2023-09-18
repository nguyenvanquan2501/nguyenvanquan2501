/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05011;

/**
 *
 * @author vanquan
 */
import java.util.*;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
class Customer{
    private String ID,Name,Timein,Timeout,Preiod;
    public Customer(String ID, String Name, String Timein, String Timeout){
        this.ID=ID;
        this.Name=Name;
        this.Timein=Timein;
        this.Timeout=Timeout;
        this.Preiod=formatTimeOfPreiod(Timein,Timeout);
    }
    public String getPreiod(){
        return Preiod;
    }
    public Duration getDuration() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime startTime = LocalTime.parse(Timein, formatter);
        LocalTime endTime = LocalTime.parse(Timeout, formatter);
        return Duration.between(startTime, endTime);
    }
    public String formatTimeOfPreiod(String Timein, String Timeout) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    LocalTime startTime = LocalTime.parse(Timein, formatter);
    LocalTime endTime = LocalTime.parse(Timeout, formatter);
    Duration duration = Duration.between(startTime, endTime);
    long hours = duration.toHours();
    long minutes = duration.toMinutes() % 60; // Lấy phần phút sau khi đã tính giờ

    String betweenTime = Long.toString(hours) + " gio " + Long.toString(minutes) + " phut";
    return betweenTime;
}

    @Override
    public String toString(){
        return ID+" "+Name+" "+Preiod;
    }
}
class PreiodTimeCoparator implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        Duration durationA = a.getDuration();
        Duration durationB = b.getDuration();

        return durationB.compareTo(durationA);
    }
}

public class J05011 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Customer[] ds = new Customer[n];
        for(int i =0;i<n;i++){
            ds[i] = new Customer(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(ds, new PreiodTimeCoparator());
        for(Customer num : ds){
            System.out.println(num);
        }
    }
}

