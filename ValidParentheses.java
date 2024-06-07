package LeetcodePractice;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack= new Stack<Character>();

        for(char c : s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=c) return false;
        }
        return stack.isEmpty();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parentheses string that you want to check");
        String parentheses=sc.nextLine();
        System.out.println("The parentheses string is a "+isValid(parentheses)+" expression ");
        
    }
}
