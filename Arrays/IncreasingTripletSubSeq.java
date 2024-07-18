package LeetcodePractice.Arrays;

import java.util.Scanner;

public class IncreasingTripletSubSeq {
    public static boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int num : nums){
            if(num<=first) first=num;
            else if(num<=second) second= num;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the element in array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("is there exists a triple of indices ?-"+increasingTriplet(array));
    }
}
