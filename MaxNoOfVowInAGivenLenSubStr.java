package LeetcodePractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaxNoOfVowInAGivenLenSubStr {
    public static int maxVowels(String s, int k) {
        int i=0,j=0,ans=0;
        int max=Integer.MIN_VALUE;
        Set<Character> set= new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                ans++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,ans);
                if(set.contains(s.charAt(i))){
                    ans--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String string=sc.nextLine();
        System.out.println("Enter the value of k");
        int k= sc.nextInt();
        System.out.println("The maximum number of vowel letters in any substring of s with length k is-"+maxVowels(string, k));
        
    }
}
