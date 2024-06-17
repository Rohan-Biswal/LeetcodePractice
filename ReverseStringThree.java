package LeetcodePractice;
import java.util.*;

public class ReverseStringThree {

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for(String word:s.split(" ")){
            StringBuilder temp=new StringBuilder(word);
            ans.append(temp.reverse());
            ans.append(" ");
        }
        return ans.substring(0,s.length()).toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in which you want to reverse every word");
        String string = sc.nextLine();
        System.out.println("The String after reversing every word is-"+reverseWords(string));
    }
}
