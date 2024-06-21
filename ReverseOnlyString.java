package LeetcodePractice;
import java.util.*;

public class ReverseOnlyString {

    public static String reverseOnlyLetters(String s) {
        if(s== null || s.isEmpty()) return "";
        char[] sChar=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetter(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetter(s.charAt(right))){
                right--;
            }
            if(left<right){
                char temp=sChar[left];
                sChar[left++]=sChar[right];
                sChar[right--]=temp;
            }
        }
        return new String(sChar);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string=sc.nextLine();
        System.out.println("the string after reversing only letter is->"+reverseOnlyLetters(string));
        
    }
}
