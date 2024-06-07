package LeetcodePractice;


import java.util.*;

public class LenOfLastword {

    public static int lengthOfLastWord(String s) {
        
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else if (count>0){
                break;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("The lenght of last word of this string is- "+lengthOfLastWord(s));
        
        
    }
}
