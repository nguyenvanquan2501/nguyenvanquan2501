import java.util.*;

class Time{
    private int Hour;
    private int Minute;
    private int Second;
    public Time(int Hour, int Minute, int Second){
        this.Hour=Hour;
        this.Minute=Minute;
        this.Second=Second;
    }
    public int getHour(){
        return Hour;
    }
    public int getMinute(){
        return Minute;
    }
    public int getSecond(){
        return Second;
    }

}
class TimeComparator implements Comparator<Time> {
    public int compare(Time t1, Time t2) {
        if (t1.getHour() > t2.getHour()) {
            return 1;
        } else if (t1.getHour() < t2.getHour()) {
            return -1;
        } else {
            if (t1.getMinute() > t2.getMinute()) {
                return 1;
            } else if (t1.getMinute() < t2.getMinute()) {
                return -1;
            } else {
                if (t1.getSecond() > t2.getSecond()) {
                    return 1;
                } else if (t1.getSecond() < t2.getSecond()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}

public class J05033 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();
        List<Time> time = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int h = sc.nextInt();
            int p = sc.nextInt();
            int s = sc.nextInt();
            Time t = new Time(h,p,s);
            time.add(t);
        }
        Collections.sort(time, new TimeComparator());
        for(Time t : time){
            System.out.println(t.getHour()+" "+t.getMinute()+" "+t.getSecond());
        }
    }
    public static void main(String[]args){
        test();
    }
}
