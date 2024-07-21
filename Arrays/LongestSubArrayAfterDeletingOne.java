package LeetcodePractice.Arrays;

import java.util.Scanner;

public class LongestSubArrayAfterDeletingOne {
    public static int longestSubarray(int[] nums) {
        int start=0;
        int end=0;
        int zeros=0;
        while(end<nums.length){
            if(nums[end]==0){
                zeros++;
            }
            end++;
            if(zeros>=2){
                if(nums[start]==0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the value in Array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The size of the longest non-empty subarray containing only 1's in the resulting array is-"+longestSubarray(array));    
    }
}
