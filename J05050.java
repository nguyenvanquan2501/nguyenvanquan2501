import java.util.*;
class MoneyOfElectric{
    private String Type,ID;
    public static int id=1;
    private int totalMoney,addtional,money,coefficient,newIndex,oldIndex;
    public MoneyOfElectric(String Type, int oldIndex, int newIndex){
        this.ID=String.format("KH%02d",id++);
        if(Type.equals("KD")){
            this.addtional=3;
        }else if(Type.equals("NN")){
            this.addtional=5;
        }else if(Type.equals("TT")){
            this.addtional=4;
        }else{
            this.addtional=2;
        }
        this.money=(newIndex-oldIndex)*addtional*550;
        if(newIndex-oldIndex<50){
            this.coefficient=0;
        }else if(newIndex-oldIndex>=50 && newIndex-oldIndex<=100){
            this.coefficient=(int)0.35*money;
        }else{
            this.coefficient=money;
        }
        this.totalMoney=money+coefficient;
    }   
    @Override
    public String toString(){
        return ID+" "+addtional+" "+money+" "+coefficient+" "+totalMoney;
    }
}
public class J05050{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<n;i++){
            String ID = sc.nextLine();
            int oldindex = Integer.parseInt(sc.nextLine());
            int newindex = Integer.parseInt(sc.nextLine());
            MoneyOfElectric money = new MoneyOfElectric(ID, oldindex, newindex);
            System.out.println(money);
        }
    }
}