package LeetcodePractice;
import java.util.*;

public class DIStringMatch {

    public static int[] diStringMatch(String s) {
        int[] result= new int[s.length()+1];
        int min=0;
        int max=s.length();
        int i=0;
        for(i=0;i<s.length();i++){
            result[i]=s.charAt(i)=='I'?min++:max--;
        }
        result[i]= min;
        return result;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string having D or I");
        String string=sc.nextLine();
        int[] result=diStringMatch(string);
        System.out.println("The value after maching is-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }
}
