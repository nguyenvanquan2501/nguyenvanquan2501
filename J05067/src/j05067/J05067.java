package j05067;
import java.util.Scanner;

public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String code = sc.nextLine();
            int mount = Integer.parseInt(sc.nextLine());
            Goods goods = new Goods(code, mount);
            System.out.println(goods);
        }
    }
}

class Goods {
    private String codeGoods, manufacturer;
    private long price, total, totalexcise;

    public Goods(String codeGoods, int mount) {
        this.codeGoods = codeGoods;
        if (codeGoods.startsWith("X")) {
            this.price = 128000;
            this.totalexcise = Math.round(0.03 * price * mount);
        } else if (codeGoods.startsWith("D")) {
            this.price = 11200;
            this.totalexcise = Math.round(0.035 * price * mount);
        } else {
            this.price = 9700;
            this.totalexcise = Math.round(0.02 * price * mount);
        }

        String subCode = codeGoods.substring(codeGoods.length() - 2);
        if (subCode.equals("BP")) {
            this.manufacturer = "British Petro";
        } else if (subCode.equals("ES")) {
            this.manufacturer = "Esso";
        } else if (subCode.equals("SH")) {
            this.manufacturer = "Shell";
        } else if (subCode.equals("CA")) {
            this.manufacturer = "Castrol";
        } else if (subCode.equals("MO")) {
            this.manufacturer = "Mobil";
        } else {
            this.manufacturer = "Trong Nuoc";
            this.totalexcise = 0;
        }
        this.total = price * mount + totalexcise;
    }

    @Override
    public String toString() {
        return codeGoods + " " + manufacturer + " " + price + " " + totalexcise + " " + total;
    }
}
