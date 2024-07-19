package LeetcodePractice;

import java.util.Scanner;

public class GCDOfString {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int l=gcd(str1.length(),str2.length());
        return str1.substring(0,l);
    }
    private static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=sc.nextLine();
        System.out.println("Enter the second String");
        String str2=sc.nextLine();
        System.out.println("the largest string x such that x divides both str1 and str2 is-"+gcdOfStrings(str1, str2));
    }
}
