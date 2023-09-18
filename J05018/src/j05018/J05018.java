/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05018;

/**
 *
 * @author vanquan
 */
import java.util.*;

class Student {
    private String Name, ID;
    private double mathScore, Literature, English, Physical, Chemitry, Biology, History, Geography, Civic, Technology;
    private double Score;
    private String learnCapacity;
    private static int id = 1;

    public Student(String Name, double mathScore, double Literature, double English, double Physical, double Chemitry, double Biology, double History, double Geography, double Civic, double Technology) {
        this.ID = String.format("HS%02d", id++);
        this.Name = Name;
        this.mathScore = 2 * mathScore;
        this.Literature = 2 * Literature;
        this.English = English;
        this.Physical = Physical;
        this.Chemitry = Chemitry;
        this.Biology = Biology;
        this.History = History;
        this.Geography = Geography;
        this.Civic = Civic;
        this.Technology = Technology;
        this.Score = (this.mathScore + this.Literature + English + Physical + Chemitry + Biology + History + Geography + Civic + Technology) / 12;
        this.Score = java.lang.Math.round(this.Score * 10) / 10.0; // Làm tròn điểm trung bình
        setLearnCapacity();
    }

    private void setLearnCapacity() {
        if (Score >= 9) {
            this.learnCapacity = "XUAT SAC";
        } else if (Score >= 8) {
            this.learnCapacity = "GIOI";
        } else if (Score >= 7) {
            this.learnCapacity = "KHA";
        } else if (Score >= 5) {
            this.learnCapacity = "TB";
        } else {
            this.learnCapacity = "YEU";
        }
    }

    public double getScore() {
        return Score;
    }

    @Override
    public String toString() {
        return ID + " " + Name + " " + String.format("%.1f", getScore()) + " " + learnCapacity;
    }
}

class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student hs1, Student hs2) {
        if (hs1.getScore() < hs2.getScore()) {
            return 1;
        } else if (hs1.getScore() > hs2.getScore()) {
            return -1;
        }
        return 0;
    }
}

public class J05018 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(ds, new ScoreComparator());
        for (Student num : ds) {
            System.out.println(num);
        }
    }
}


