package LeetcodePractice;
import java.util.*;


public class RepeatingSubstring {

    public static boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String sub=doubled.substring(1,doubled.length()-1);
        return sub.contains(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check is repeating or not");
        String string=sc.nextLine();
        System.out.println("The give string is-"+repeatedSubstringPattern(string));
    }
    
}
