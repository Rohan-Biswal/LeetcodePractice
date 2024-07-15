package LeetcodePractice.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int s=0;
        while(n!=0){
            s+=Math.pow(n%10,2);
            n/=10;
        }
        HashSet<Integer> set= new HashSet<>();
        while(s!=1 && !set.contains(s)){
            n=s;
            s=0;
            set.add(n);
            while(n!=0){
                s+=Math.pow(n%10,2);
                n/=10;
            }
        }
        if(s==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you want to check is a happy number or not");
        int number=sc.nextInt();
        System.out.println("The given number is Happy Number-"+isHappy(number));
    }
}
