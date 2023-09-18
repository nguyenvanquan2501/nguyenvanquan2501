
/**
 *
 * @author vanquan
 */

import java.util.Scanner;

class Employee {
    private String ID, Name, Post;
    public static int id = 1;
    private int salary, Total, Pension, allSalary, advance;

    public Employee(String Name, String Post, int baseSalary, int daysWorked) {
        this.ID = String.format("NV%02d", id++);
        this.Name = Name;
        this.allSalary = baseSalary * daysWorked; // lương chính
        this.Post = Post;
        
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
    
    public String getPost() {
        return this.Post;
    }
    
    @Override
    public String toString() {
        int remaining = this.salary - this.advance;
        return ID + " " + Name + " " + Pension + " " + allSalary + " " + advance + " " + remaining;
    }
}

public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] ds = new Employee[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String post = sc.nextLine();
            int baseSalary = sc.nextInt();
            int daysWorked = sc.nextInt();
            sc.nextLine(); 
            ds[i] = new Employee(name, post, baseSalary, daysWorked);
        }
        String postToSearch = sc.nextLine();
        for (Employee emp : ds) {
            if (emp.getPost().equals(postToSearch)) {
                System.out.println(emp);
            }
        }
    }
}

