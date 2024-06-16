package LeetcodePractice;
import java.util.*;

public class SegmentIntring {
    public static int countSegments(String s) {
        StringTokenizer st = new StringTokenizer(s);
        return st.countTokens();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string=sc.nextLine();
        System.out.println("The given has "+countSegments(string)+" number of segments in it.");
    }
}
