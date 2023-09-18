
/**
 *
 * @author vanquan
 */
import java.util.*;

class Examinee {
    private String Name;
    private int Num, NumSubmit;

    public Examinee(String Name, int Num, int NumSubmit) {
        this.Name = Name;
        this.Num = Num;
        this.NumSubmit = NumSubmit;
    }

    public String getName() {
        return Name;
    }

    public int getNum() {
        return Num;
    }

    public int getNumSubmit() {
        return NumSubmit;
    }

    @Override
    public String toString() {
        return Name + " " + Num + " " + NumSubmit;
    }
}

class NumComparator implements Comparator<Examinee> {
    @Override
    public int compare(Examinee a, Examinee b) {
        int numComparison = Integer.compare(a.getNum(), b.getNum());
        if (numComparison != 0) {
            return -numComparison; // Đảo ngược để sắp xếp giảm dần
        }
        int numSubmitComparison = Integer.compare(a.getNumSubmit(), b.getNumSubmit());
        if (numSubmitComparison != 0) {
            return numSubmitComparison;
        }
        return a.getName().compareTo(b.getName());
    }
}

public class J05042 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Examinee[] ds = new Examinee[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String[] parts = sc.nextLine().split(" ");
            int num = Integer.parseInt(parts[0]);
            int numSubmit = Integer.parseInt(parts[1]);
            ds[i] = new Examinee(name, num, numSubmit);
        }
        Arrays.sort(ds, new NumComparator());
        for (Examinee num : ds) {
            System.out.println(num);
        }
    }
}
