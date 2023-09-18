package j05043;

import java.util.Scanner;

class Employee {
    private String ID, Name, Post;
    public static int id = 1;
    private int salary, Total, Pension, allSalary, advance;
    
    public Employee(String Name, String Post, int baseSalary, int daysWorked) {
        this.ID = String.format("NV%02d", id++);
        this.Name = Name;
        this.allSalary = baseSalary * daysWorked; // lương chính
        
        switch (Post) {
            case "GD":
                this.Pension = 500;
                break;
            case "PGD":
                this.Pension = 400;
                break;
            case "TP":
                this.Pension = 300;
                break;
            case "KT":
                this.Pension = 250;
                break;
            default:
                this.Pension = 100;
                break;
        }
        
        this.salary = this.allSalary + this.Pension;
        
        double tempAdvance = (this.Pension + this.allSalary) * 2.0 / 3;
        if (tempAdvance < 25000) {
            this.advance = (int) Math.round(tempAdvance / 1000) * 1000;
        } else {
            this.advance = 25000;
        }
    }
    
    @Override
    public String toString() {
        int remaining = this.salary - this.advance;
        return ID + " " + Name + " " + Pension + " " + allSalary + " " + advance + " " + remaining;
    }
}

public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String post = sc.nextLine();
            int baseSalary = Integer.parseInt(sc.nextLine());
            int daysWorked = Integer.parseInt(sc.nextLine());
            Employee emp = new Employee(name, post, baseSalary, daysWorked);
            System.out.println(emp);
        }
    }
}
