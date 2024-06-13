package LeetcodePractice;
import java.util.*;

public class LongestPlaindrom {

    public static int longestPalindrome(String s) {
        HashSet<Character> charSet= new HashSet<>();
        int length=0;

        for(char c:s.toCharArray()){
            if(charSet.contains(c)){
                charSet.remove(c);
                length+=2;
            }
            else{
                charSet.add(c);
            }
        }
        if(!charSet.isEmpty()){
            length+=1;
        }

        return length;
        
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string");  
      String string = sc.nextLine();
      System.out.println("The Longest palindrom we an make is of length- "+longestPalindrome(string));
    }
}
