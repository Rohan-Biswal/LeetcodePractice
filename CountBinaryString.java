package LeetcodePractice;
import java.util.*;

public class CountBinaryString {

    public static int countBinarySubstrings(String s) {
        int cur=1,prev=0,ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) cur++;
            else{
                ans+=Math.min(cur,prev);
                prev=cur;
                cur=1;
            }
        }
        return ans+Math.min(cur,prev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number which you want to count");
        String binaryNumber= sc.nextLine();
        System.out.println("The total cout of consecqtive 0 and 1 are-"+countBinarySubstrings(binaryNumber));
        
    }
    
}
