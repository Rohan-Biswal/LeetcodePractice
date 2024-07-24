package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MinSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0,currSum=0,minValue=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            while(currSum>=target){
                minValue=Math.min(minValue,right-left+1);
                currSum-=nums[left];
                left++;
            }
        }
        return minValue==Integer.MAX_VALUE?0:minValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Target");
        int targer=sc.nextInt();
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the value in Array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the minimal length of a subarray whose sum is greater than or equal to target is-"+minSubArrayLen(targer, array));  
    }
}