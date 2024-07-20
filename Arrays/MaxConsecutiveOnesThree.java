package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnesThree {
    public static int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
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
        System.out.println("Enetr the value of k");
        int k=sc.nextInt();
        System.out.println("he maximum number of consecutive 1's in the array if you can flip at most k 0's. is-"+longestOnes(array, k));
    }
}
