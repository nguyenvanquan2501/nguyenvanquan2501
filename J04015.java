import java.util.*;

class Teacher{
    private String ID,Name;
    private int salary,incom,bonus,rank;
    public Teacher(String ID, String Name,int salary){
        this.ID=ID;
        this.Name=Name;
        this.salary=salary;
        rank=Integer.parseInt(ID.substring(2));
        if (ID.substring(0, 2).equals("HT")) {
            bonus = 2000000;
        } else if (ID.substring(0, 2).equals("HP")) {
            bonus = 900000;
        } else if (ID.substring(0, 2).equals("GV")) {
            bonus = 500000;
        }
    }
    public int getIncome(){
        return this.incom=(rank)*salary+bonus;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+(rank)+" "+bonus+" "+getIncome();
    }
}


public class J04015 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();
        Teacher gv = new Teacher(a,b,c);
        System.out.print(gv);
    }
}
