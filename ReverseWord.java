package LeetcodePractice;
import java.util.*;
public class ReverseWord {

    public static String reverseWords(String s) {
        String[] vec=s.trim().split("\\s+");
        String res="";
        for(int i=vec.length-1;i>=0;i--){
            if(res.length()==0)
                res=vec[i];
            else{
                res=res+" "+vec[i];
            }
        }      
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string you want to reverse the words");
        String s=sc.nextLine();
        System.out.println("The reversed word string is- "+reverseWords(s));

    }
}
