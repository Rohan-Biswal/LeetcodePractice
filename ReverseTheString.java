package LeetcodePractice;
import java.util.*;
public class ReverseTheString{

    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string you want to reversed");
        String string=sc.nextLine();
        char[] charaterstring=string.toCharArray();
        ReverseTheString r = new ReverseTheString();
        r.reverseString(charaterstring);
        System.out.println("The reversed string is - "+String.valueOf(charaterstring));

    }
}