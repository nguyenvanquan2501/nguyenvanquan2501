import java.util.*;
class Credit{
    private String codeClass,nameClass,groupClass,nameLecturer;
    public Credit(String codeClass,String nameClass,String groupClass,String nameLecturer){
        this.codeClass=codeClass;
        this.nameClass=nameClass;
        this.groupClass=groupClass;
        this.nameLecturer=nameLecturer;
    }
    public String getcodeClass(){
        return codeClass;
    }
    public String getnameClass(){
        return nameClass;
    }
    @Override
    public String toString(){
        return groupClass+" "+nameLecturer;
    }
}
class GroupComparator implements Comparator<Credit>{
    public int compare(Credit a, Credit b){
        return a.getcodeClass().compareTo(b.getcodeClass());
    }
}
public class J05079 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        sc.nextLine();
        Credit[] ds = new Credit[n];
        for(int i=0;i<n;i++){
            String codeClass = sc.nextLine();
            String nameClass = sc.nextLine();
            String groupClass = sc.nextLine();
            String nameLecturer = sc.nextLine();
            ds[i] = new Credit(codeClass, nameClass, groupClass, nameLecturer);
        }
        int q = Integer.parseInt(sc.nextLine());
        Arrays.sort(ds,new GroupComparator());
        while(q-->0){
            String codename = sc.nextLine();
            for(Credit num : ds){
                if(num.getcodeClass().equals(codename)){
                    System.out.println("Danh sach nhom lop mon "+num.getnameClass()+":");
                    break;
                }
            }
            for(Credit num : ds){
                if(num.getcodeClass().equals(codename)){
                    System.out.println(num);
                }
            }
        }
    }
}
