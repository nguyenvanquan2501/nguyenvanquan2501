import java.util.Scanner;
class Candidate {

    public String ma, hoTen;
    public float tongDiem, diemUuTien;

    public Candidate(String ma, String hoTen, float math, float physical, float chemistry ) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tongDiem = 2*math+physical+chemistry;

        switch (ma.substring(0, 3)) {
            case "KV1":
                this.diemUuTien = 0.5f;
                break;
            case "KV2":
                this.diemUuTien = 1.f;
                break;
            case "KV3":
                this.diemUuTien = 2.5f;
                break;
        }
    }

    public String formatFloat(float x) {
        int xInt = (int) (x * 10);
        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    public String getStatus() {
        float benchmark = 24.f;
        return tongDiem + diemUuTien >= benchmark ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + formatFloat(diemUuTien) + " " + formatFloat(tongDiem) + " " + getStatus();
    }
}

public class J04013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String hoTen = sc.nextLine();
        float math = sc.nextFloat();
        float physical = sc.nextFloat();
        float chemistry = sc.nextFloat();
        Candidate candidate = new Candidate(ma, hoTen, math,physical,chemistry);
        System.out.println(candidate);
    }
}