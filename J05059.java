import java.util.*;

public class J05059 {
    public static class Student implements Comparable<Student> {
        String id;
        String name;
        double mathScore;
        double physicsScore;
        double chemistryScore;
        double priorityScore;
        double totalScore;

        public Student(String id, String name, double mathScore, double physicsScore, double chemistryScore) {
            this.id = id;
            this.name = name;
            this.mathScore = mathScore;
            this.physicsScore = physicsScore;
            this.chemistryScore = chemistryScore;
            this.priorityScore = getPriorityScore(id);
            this.totalScore = mathScore * 2 + physicsScore + chemistryScore + priorityScore;
        }

        private double getPriorityScore(String id) {
            String region = id.substring(0, 3);
            if (region.startsWith("KV3")) return 2.5;
            if (region.startsWith("KV2")) return 1.0;
            return 0.0;
        }

        @Override
        public int compareTo(Student other) {
            if (this.totalScore != other.totalScore) {
                return Double.compare(other.totalScore, this.totalScore);
            }
            return this.id.compareTo(other.id);
        }

        @Override
        public String toString() {
            String status = totalScore >= UniversityAdmission.cutoff ? "TRUNG TUYEN" : "TRUOT";
            return String.format("%s %s %.1f %.1f %s", id, name, priorityScore, totalScore, status);
        }
    }

    public static double cutoff;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            double mathScore = sc.nextDouble();
            double physicsScore = sc.nextDouble();
            double chemistryScore = sc.nextDouble();
            if (i < n - 1) sc.nextLine(); // Consume newline

            students.add(new Student(id, name, mathScore, physicsScore, chemistryScore));
        }

        int quota = sc.nextInt();
        Collections.sort(students);

        cutoff = students.get(quota - 1).totalScore;

        System.out.printf("%.1f\n", cutoff);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
