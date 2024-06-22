package LeetcodePractice;

import java.util.*;

public class LongestUncommonStringOne {

    public static int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        int ag=Math.max(a.length(),b.length());
        return ag;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the First String");
        String firstString=sc.nextLine();
        System.out.println("Enter the Second String");
        String secondString=sc.nextLine();
        System.out.println("The longest Substring in both string is-"+findLUSlength(firstString, secondString));

    }
    
}
