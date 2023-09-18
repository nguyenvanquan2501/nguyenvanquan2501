
/**
 *
 * @author vanquan
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vanquan
 *
/
package j05026;
**/

import java.util.*;
class Teacher{
    private String ID,Name,Major,AbbreviateOfMajor;
    public static int id=1;
    public Teacher(String Name,String Major){
        this.Name=Name;
        this.Major=Major;
        this.ID=String.format("GV%02d",id++);
        this.AbbreviateOfMajor = getAbbreviateOfMajor();
    }
    public String getAbbreviateOfMajor(){
        String[] Words = Major.split("\\s+");
        String res = "";
        for(String word : Words){
            res+=Character.toUpperCase(word.charAt(0));
        }
        return res;
    }
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+AbbreviateOfMajor;
    }
}
// class DisposeComparator implements Comparator<Teacher>{
//     public int compare (Teacher a, Teacher b){
//         if(a.getName().compareTo(b.getName())<0){
//             return 1;
//         }else if(a.getName().compareTo(b.getName())==0) {
//             if(a.getID().compareTo(b.getID())<0){
//               return 1;  
//             }
//         }else{
//             return 0;
//         }
//         return -1;
//     }
// }
public class J05027 {
    public static Scanner sc =new Scanner(System.in);
    // public static String AbbreviateOfMajor(String Major){
    //     String[] Words = Major.split("\\s+");
    //     String res = "";
    //     for(String word : Words){
    //         res+=Character.toUpperCase(word.charAt(0));
    //     }
    //     return res;
    // }
    public static void main(String[]args){ 
            int n = sc.nextInt();
            sc.nextLine();
            Teacher[] ds = new Teacher[n];
                for(int i=0;i<n;i++){
                    ds[i]= new Teacher(sc.nextLine(), sc.nextLine());
            } 
            //Arrays.sort(ds,new DisposeComparator());
            int q = sc.nextInt();
            sc.nextLine();
            while(q-->0){
                String word = sc.nextLine();  
                System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+word+":");
                for(Teacher num : ds){
                    if(num.getName().toLowerCase().contains(word.toLowerCase())){
                        System.out.println(num);
                }
            }   
        }
    }
}


