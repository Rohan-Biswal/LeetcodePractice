package LeetcodePractice;

import java.util.Scanner;

public class ReverseVowelInString {

    public static String reverseVowels(String s) {
        char [] sChar=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        String vowels="aeiouAEIOU";

        while(start<end){
            while(start<end && vowels.indexOf(sChar[start])==-1){
                start++;
            }
            while(start<end && vowels.indexOf(sChar[end])==-1){
                end--;;
            }
            char temp=sChar[start];
            sChar[start]=sChar[end];
            sChar[end]=temp;
            start++;
            end--;
        }
        String ans= new String(sChar);
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String string=sc.nextLine();
        System.out.println("The string after reversed the vowel is- "+ reverseVowels(string));
    }
}
