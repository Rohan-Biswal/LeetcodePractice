package LeetcodePractice;

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        char[] sChars=s.toCharArray();
        char[] tChars=t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars,tChars);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String firstString=sc.nextLine();
        System.out.println("Enter the second String");
        String secondString=sc.nextLine();

        System.out.println("It is a "+isAnagram(firstString, secondString)+" Anagram");

    }
}
