package LeetcodePractice.Stacks;

import java.util.*;


public class ScoreOfParenthesise {
    public static int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(count);
                count=0;
            }else{
                count=st.pop()+Math.max(2*count,1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthisese String");
        String string=sc.nextLine();
        System.out.println("The count of Parenthesise is-"+scoreOfParentheses(string));
    }
}
