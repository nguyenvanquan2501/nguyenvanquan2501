


/**
 *
 * @author vanquan
 */
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employee{
    private String ID,Name,gender,DayofBirth,Address,Code,date;
    public static int id = 1;
    public Employee(String Name,String gender,String DayofBirth,String Address,String Code,String date){
        this.ID=String.format("%05d",id++);
        this.Name=Name;
        this.gender=gender;
        this.DayofBirth=formatDate(DayofBirth);
        this.Address=Address;
        this.Code=Code;
        this.date=date;
    }
    public String formatDate(String date){
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, inputTimeFormatter);
        return date;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+gender+" "+DayofBirth+" "+Address+" "+Code+" "+date;
    }

}

public class J05006 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] ds = new Employee[n];
        for(int i=0;i<n;i++){
            ds[i] = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(Employee num : ds){
            System.out.println(num);
        }
    }
}
