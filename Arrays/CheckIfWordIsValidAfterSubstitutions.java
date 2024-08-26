package LeetcodePractice.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class CheckIfWordIsValidAfterSubstitutions {
    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<n;i++)
        {
            stk.push(s.charAt(i));
            if(s.charAt(i)=='c' && stk.size()>=3)
            {
                char c,b,a;
                c = stk.pop();
                b = stk.pop();
                a = stk.pop();
                if(a=='a' && b=='b' && c=='c')
                {
                }
                else
                {
                    stk.push(a);
                    stk.push(b);
                    stk.push(c);
                }
            }
            else if(s.charAt(i)=='c')
                return false;
        }
        return stk.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string=sc.next();
        System.out.println("s is a valid string ?:-"+isValid(string));
    }
}
