package LeetcodePractice.Arrays;

import java.util.Scanner;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        if(nums.length==0) return -1;
        for(int num :nums){
            rightSum+=num;
        }
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum) return i;
            leftSum+=nums[i];
        }
        return -1;
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
        System.out.println("The Pivot index is-"+pivotIndex(array));    
    }
}
