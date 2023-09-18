import java.util.*;
import java.text.DecimalFormat;

public class J6008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, String> courses = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ", 2);
            courses.put(parts[0], parts[1]);
        }

        int m = sc.nextInt();
        sc.nextLine();
        Map<String, String> teachers = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] parts = sc.nextLine().split(" ", 2);
            teachers.put(parts[0], parts[1]);
        }

        int k = sc.nextInt();
        sc.nextLine();
        Map<String, List<CourseHour>> teachingHours = new HashMap<>();
        for (int i = 0; i < k; i++) {
            String[] parts = sc.nextLine().split(" ");
            String teacherId = parts[0];
            String courseId = parts[1];
            double hours = Double.parseDouble(parts[2]);
            teachingHours.putIfAbsent(teacherId, new ArrayList<>());
            teachingHours.get(teacherId).add(new CourseHour(courseId, hours));
        }

        String teacherIdToQuery = sc.nextLine();
        System.out.println("Giang vien: " + teachers.get(teacherIdToQuery));
        double totalHours = 0;
        for (CourseHour ch : teachingHours.get(teacherIdToQuery)) {
            System.out.println(courses.get(ch.courseId) + " " + ch.hours);
            totalHours += ch.hours;
        }
        System.out.println("Tong: " + new DecimalFormat("#.00").format(totalHours));
    }
}

class CourseHour {
    String courseId;
    double hours;

    public CourseHour(String courseId, double hours) {
        this.courseId = courseId;
        this.hours = hours;
    }
}
