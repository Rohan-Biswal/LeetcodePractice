package LeetcodePractice;

import java.util.Scanner;

public class AdditionOfBinary {

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry=0;
        int indexOfA=a.length()-1;
        int indexOfB=b.length()-1;

        while(indexOfA>=0 || indexOfB>=0 || carry==1){
            if(indexOfA>=0)
                carry+=a.charAt(indexOfA--) - '0';
            if(indexOfB>=0)
                carry+=b.charAt(indexOfB--) - '0';
            sb.append(carry%2);
            carry/=2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        String firstString=sc.nextLine();
        System.out.println("Enter the Second Number");
        String secondString=sc.nextLine();
        System.out.println("The result after addition is- "+addBinary(firstString, secondString));
        
    }
    
}
