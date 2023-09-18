/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05080;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Credit{
    private String codeClass,nameClass,groupClass,nameLecturer;
    public Credit(String codeClass,String nameClass,String groupClass,String nameLecturer){
        this.codeClass=codeClass;
        this.nameClass=nameClass;
        this.groupClass=groupClass;
        this.nameLecturer=nameLecturer;
    }
    public String getGroupClass(){
        return groupClass;
    }
    public String getcodeClass(){
        return codeClass;
    }
    public String getnameClass(){
        return nameClass;
    }
    public String getnameLecture(){
        return nameLecturer;
    }
    @Override
    public String toString(){
        return codeClass+" "+nameClass+" "+groupClass;
    }
}
class GroupComparator implements Comparator<Credit>{
    public int compare(Credit a, Credit b){
       int k = a.getcodeClass().compareTo(b.getcodeClass());
       if(k==0){
           return a.getGroupClass().compareTo(b.getGroupClass());
    }else if(k<0){
        return a.getcodeClass().compareTo(b.getcodeClass());
    }else{
        return 0;
    }
    }
}
public class J05080 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        sc.nextLine();
        Credit[] ds = new Credit[n];
        for(int i=0;i<n;i++){
            String codeClass = sc.nextLine();
            String nameClass = sc.nextLine();
            String groupClass = sc.nextLine();
            String nameLecturer = sc.nextLine();
            ds[i] = new Credit(codeClass, nameClass, groupClass, nameLecturer);
        }
        int q = Integer.parseInt(sc.nextLine());
        Arrays.sort(ds,new GroupComparator());
        while(q-->0){
            String nameLecture = sc.nextLine();
            for(Credit num : ds){
                if(num.getnameLecture().equals(nameLecture)){
                    System.out.println("Danh sach nhom lop mon "+num.getnameLecture()+":");
                    break;
                }
            }
            for(Credit num : ds){
                if(num.getnameLecture().equals(nameLecture)){
                    System.out.println(num);
                }
            }
        }
    }
}
