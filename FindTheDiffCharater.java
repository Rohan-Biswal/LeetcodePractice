package LeetcodePractice;
import java.util.*;

public class FindTheDiffCharater {

    public static char findTheDifference(String s, String t) {
        char c=0;
        for(char cs: s.toCharArray()) c^=cs;
        for(char ct : t.toCharArray()) c^=ct;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString=sc.nextLine();
        System.out.println("Enter the second string");
        String secondString=sc.nextLine();
        System.out.println("the difference in the both string is- "+findTheDifference(firstString, secondString));
        
        
    }
}
