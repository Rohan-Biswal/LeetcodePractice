package LeetcodePractice.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAllAdjDuplicateInSrting {
    public static String removeDuplicates(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> st= new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.size()==0) st.push(arr[i]);
            else if(st.peek()==arr[i]) st.pop();
            else st.push(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string=sc.nextLine();
        System.out.println("After Removal of all duplicate in adjecent of the given string is-"+removeDuplicates(string));
    }
}
