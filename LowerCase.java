package LeetcodePractice;

import java.util.Scanner;

public class LowerCase {

    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if('A' <= arr[i] && arr[i]<='Z'){
                arr[i]=(char)(arr[i]-'A'+'a');
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = sc.nextLine();
        System.out.println("The string after coverting the string into lower case is-"+toLowerCase(string));
    }
    
}
