package LeetcodePractice;

import java.util.Scanner;

public class RemoveOutterParenthesis {

    public static String removeOuterParentheses(String s) {
        int length=s.length();
        int open=1;
        char[] ch=s.toCharArray();
        StringBuilder ans= new StringBuilder();
        for(int i=1;i<length;i++){
            if(ch[i]=='('){
                open++;
                if(open>1) ans.append('(');
            }else{
                if(open>1) ans.append(')');
                open--;
            }
        }
        return ans.toString();  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of parenthesis");
        String parentheses= sc.next();
        System.out.println("After removing outer parentheses of each part in the string is-"+removeOuterParentheses(parentheses));
    }
}
