package LeetcodePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DetermineIfTwoStringAreClose {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashSet<Character> set = new HashSet<>();
        char[] c1=word1.toCharArray();
        char[] c2=word2.toCharArray();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char c:c1){
            set.add(c);
            arr1[c-'a']++;
        }
        for(char c:c2){
            if(!set.contains(c)) return false;
            arr2[c-'a']++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String firstString=sc.nextLine();
        System.out.println("Enter the Second String");
        String secondString=sc.nextLine();
        System.out.println("The two Strings are close ?->"+closeStrings(firstString, secondString));
    }
}
