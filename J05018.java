import java.util.*;
class Student{
    private String Name,ID;
    private double Math,Literature,English,Physical,Chemitry,Biology,History,Geography,Civic,Technology;
    private double Score;
    private String learnCapacity;
    private static int id=1;
    public Student(String Name,double Math,double Literature,double English,double Physical,double Chemitry,double Biology,double History,double Geography,double Civic,double Technology){
        this.ID=String.format("HS%02d",id++);
        this.Math=2*Math;
        this.Literature=2*Literature;
        this.English=English;
        this.Physical=Physical;
        this.Chemitry=Chemitry;
        this.Biology=Biology;
        this.History=History;
        this.Geography=Geography;
        this.Civic=Civic;
        this.Technology=Technology;
        this.Score=Math+Literature+English+Physical+Chemitry+Biology+History+Geography+Civic+Technology;
        Score = (Score/12);
        if(Score >=9){
            this.learnCapacity="XUAT SAC";
        }else if(Score >=8 && Score<= 8.9){
            this.learnCapacity="GIOI";
        }else if(Score>=7 && Score<=7.9){
            this.learnCapacity="KHA";
        }else if(Score>=5 && Score<=6.9){
            this.learnCapacity="TB";
        }else{
            this.learnCapacity="YEU";
        }
    }
    public double getScore(){
        return Score;
    }
    public String getLearnCapacity(){
        return learnCapacity;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+String.format("%.1f",getScore())+" "+getLearnCapacity();
    }
}
class ScoreComparator implements Comparator<Student>{
    @Override
    public int compare (Student hs1, Student hs2){
        if(hs1.getScore()>hs2.getScore()){
            return 1;
        }else{
            return 0;
        }
    }
}
public class J05018 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for(int i=0;i<n;i++){
            ds[i]= new Student(sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(ds,new ScoreComparator());
        for(Student num:ds){
            System.out.println(num);
        }
    }
}
