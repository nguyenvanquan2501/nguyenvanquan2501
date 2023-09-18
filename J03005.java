import java.util.*;

public class J03005{
    public static Scanner sc = new Scanner(System.in);
    public static String nomalizeLastName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toUpperCase();
    }
    public static String nomalizeName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void test(){
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        String res = nomalizeLastName(words[0]);
        String res2 = "";
        for(String word : words){
            res2+= nomalizeName(word)+" ";
        }
        res = res2+", "+res;
        System.out.println(res);
    }
    public static void main(String[]args){
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            test();
        }
    }
}