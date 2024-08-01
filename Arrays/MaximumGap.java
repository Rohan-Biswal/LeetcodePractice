package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {
    public static int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int max= Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>max) max=nums[i]-nums[i-1];
        }
        return max;
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
        System.out.println("The maximum gap is-"+maximumGap(array)); 
    }
}
