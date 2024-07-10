package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=0;
            }else{
                count++;
            }if(count>max){
                max=count;
            }
        }
        return max;
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
        System.out.println("the maximum number of consecutive 1's in the array is-"+findMaxConsecutiveOnes(array));
    }
    
}