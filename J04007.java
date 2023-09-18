import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employee{
    private String mnv = "00001";
    private String name,gender,date,address,taxcode,day;
    public Employee(String name,String gender, String date, String address, String taxcode, String day){
        this.name=name;
        this.gender=gender;
        this.date=date;
        this.address=address;
        this.taxcode=taxcode;
        this.day=day;
    }
    
    public String getMnv(){
        return mnv;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getDate(){
        return date;
    }
    public String getAddress(){
        return address;
    }
    public String getTaxcode(){
        return taxcode;
    }
    public String getDay(){
        return day;
    }
}

public class J04007 {
    public static Scanner sc = new Scanner(System.in);
    public static void in(Employee s){
        System.out.print(s.getMnv()+" "+s.getName()+" "+s.getGender()+" "+s.getDate()+" "+s.getAddress()+" "+s.getTaxcode()+" "+s.getDay());
    }
    public static String ModifyDate(String s) {
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(s, inputTimeFormatter);
        String modifyDate = date.format(outputFormatter);
        return modifyDate;
    }
    public static void main(String[]args){
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String date = sc.nextLine();
        String address = sc.nextLine();
        String taxcode = sc.nextLine();
        String day = sc.nextLine();
        date = ModifyDate(date);
        day = ModifyDate(day);
        Employee s = new Employee(name, gender, date, address, taxcode, day);
        in(s);
    }
}
