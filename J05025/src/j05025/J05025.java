/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05025;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Teacher{
    private String ID,Name,Major,AbbreviateOfMajor;
    public static int id=1;
    public Teacher(String Name,String Major){
        this.Name=Name;
        this.Major=Major;
        this.ID=String.format("GV%02d",id++);
        this.AbbreviateOfMajor=getAbbreviateOfMajor(Major);
    }
    public String getAbbreviateOfMajor(String Major){
        String[] Words = Major.split("\\s+");
        String res = "";
        for(String word : Words){
            res+=Character.toUpperCase(word.charAt(0));
        }
        return res;
    }
    public String getName(){
        String[] wordName = Name.split("\\s+");
        String name="";
        for(String word : wordName){
            name=word;
        }
        return name;
    }
    public String getID(){
        return ID;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+AbbreviateOfMajor;
    }
}
class DisposeComparator implements Comparator<Teacher> {
    public int compare(Teacher a, Teacher b) {
        int nameComparison = a.getName().compareTo(b.getName());
        if (nameComparison == 0) {
            return a.getID().compareTo(b.getID());
        }
        return nameComparison;
    }
}
public class J05025 {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Teacher[] ds = new Teacher[n];
        for(int i=0;i<n;i++){
            ds[i]= new Teacher(sc.nextLine(), sc.nextLine());
        } 
        Arrays.sort(ds,new DisposeComparator());
        for(Teacher num : ds){
            System.out.println(num);
        }
    }
}

