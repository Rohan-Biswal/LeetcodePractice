package LeetcodePractice;
import java.util.*;
public class RotateString {

    public static boolean rotateString(String s,String goal){
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String firsString=sc.nextLine();
        System.out.println("Enter the goal string that you want to match");
        String goal=sc.nextLine();
        System.out.println("The string is "+rotateString(firsString, goal)+" after rotaing in left to right direction");
        
    }
}
