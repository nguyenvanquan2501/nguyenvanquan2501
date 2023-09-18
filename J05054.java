
import java.util.*;
class Student{
    private String ID,Name,Rate;
    private double Score;
    private int rank;
    public static int id=1;
    public Student(String Name,double Score, int rank){
        this.ID=String.format("HS%02d",id++);
        this.Name=Name;
        this.Score=Score;
        if(Score>9){
            this.Rate="Gioi";
        }else if(Score>=7 && Score <9){
            this.Rate="Kha";
        }else if(Score>=5 && Score<7){
            this.Rate="Trung Binh";
        }else{
            this.Rate="Yeu";
        }
        this.rank = 0;
    }
    public double getScore(){
        return Score;
    }
    public void setRank(int rank){
        this.rank=rank;
    }
    public String getID(){
        return ID;
    }
    public int getRank(){
        return rank;
    }
    //@Override;
    public String toString(){
        return ID +" "+Name+" "+String.format("%.1f",Score) +" "+Rate+" "+rank;
    }
}
class ScoreComparator implements Comparator<Student>{
    @Override
    public int compare(Student sv1 , Student sv2){
        return Double.compare(sv2.getScore(),sv1.getScore());
    }
}
class IDComparator implements Comparator<Student>{
    @Override
    public int compare(Student sv1, Student sv2){
        return sv1.getID().compareTo(sv2.getID());
    }
}
public class J05054 {
    public static Scanner sc = new Scanner( System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds  = new Student[n];
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            double score = Double.parseDouble(sc.nextLine());
            ds[i] = new Student(name,score,0);
        }
        Arrays.sort(ds,new ScoreComparator());
        int rank = 1;
        for (int i = 0; i < n; i++) {
                if (i > 0 && ds[i].getScore() == ds[i - 1].getScore()) {
                ds[i].setRank(ds[i - 1].getRank());
                } else {
                    ds[i].setRank(rank);
                }
                rank++;
}

        Arrays.sort(ds,new IDComparator());
        for(Student num : ds){
            System.out.println(num);
        }
    }
}
