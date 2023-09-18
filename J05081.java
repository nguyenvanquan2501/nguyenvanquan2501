import java.util.*;

class Consumer{
    private String Mmh,NameMh,soluong;
    private int giamua,giaban,lai;
    public Consumer(){
        
    }
    public Consumer(String Mmh,String NameMh,String soluong, int giamua, int giaban){
        this.Mmh=Mmh;
        this.NameMh=NameMh;
        this.soluong=soluong;
        this.giamua=giamua;
        this.giaban=giaban;
    }
    public String getMmh(){
        return Mmh;
    }
    public String getNameMh(){
        return NameMh;
    }
    public String getSoluong(){
        return soluong;
    }
    public int getGiamua(){
        return giamua;
    }
    public int getGiaban(){
        return giaban;
    }
    public int getLai(){
        return lai=giaban-giamua;
    }
    
}
class ComparatorConsumer implements Comparator<Consumer> {
    public int compare(Consumer s1, Consumer s2) {
        if (s1.getLai() > s2.getLai()) {
            return -1;
        } else if (s1.getLai() == s2.getLai()) {
            return s1.getMmh().compareTo(s2.getMmh());
        } else {
            return 1;
        }
    }
}

public class J05081 {
    public static Scanner sc = new Scanner(System.in);
    public static int id = 1;
    public static void main(String[]args){
        int n = Integer.parseInt(sc.nextLine());
        List<Consumer> consumer = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mh = Integer.toString(id);
            while(mh.length()<3){
                mh="0"+mh;
            }
            mh = "MH"+mh;
            String namemh = sc.nextLine();
            String soluong = sc.nextLine();
            int buyingPrice = Integer.parseInt(sc.nextLine());
            int sellingPrice = Integer.parseInt(sc.nextLine());
            Consumer M = new Consumer (mh,namemh,soluong,buyingPrice,sellingPrice);
            consumer.add(M);
            id++;
        }
        Collections.sort(consumer,new ComparatorConsumer());
        for(Consumer t : consumer){
            System.out.println(t.getMmh()+" "+t.getNameMh()+" "+t.getSoluong()+" "+t.getGiamua()+" "+t.getGiaban()+" "+t.getLai());
        }
    }
}
