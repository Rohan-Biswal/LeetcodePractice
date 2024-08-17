package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean inc=true,dec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) inc=false;
            if(nums[i]<nums[i+1]) dec=false;
        }
        return (inc || dec);
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
        System.out.println("Is the given array is monotonic ?-"+isMonotonic(array));
    }
}
