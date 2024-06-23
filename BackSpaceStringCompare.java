package LeetcodePractice;
import java.util.*;

public class BackSpaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        String s1=updatedString(s);
        String t1=updatedString(t);
        return s1.equals(t1);
    }
    private static String updatedString(String s){
        StringBuilder sb= new StringBuilder();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                c++;
            }else{
                if(c>0) c--;
                else sb.append(s.charAt(i));
            }
        }
    return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String firsString=sc.nextLine();
        System.out.println("Enter the Second String");
        String secondString=sc.nextLine();
        System.out.println("After BackSpacing when we compare two string are-"+backspaceCompare(firsString, secondString));
        
    }
}
