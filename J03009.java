import java.util.*;

public class J03009 {
    public static Scanner sc= new Scanner(System.in);
    public static void test(){
        String s1 = sc.nextLine();
        sc.nextLine();
        String s2 = sc.nextLine();
        String[] S1 = s1.split("\\s+");
        Set<String> c = new HashSet<>();
        for(String i : S1){
            if(!s2.contains(i)){
                c.add(i);
            }
        }
        for(String i : c){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            test();
        }
    }
}
