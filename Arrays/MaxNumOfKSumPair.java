package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumOfKSumPair {
    public static int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>k) j--;
            else if(nums[i]+nums[j]<k) i++;
            else{
                count++;
                i++;
                j--;
            }
        }
    return count;
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
        System.out.println("Enetr the Value of K");
        int k=sc.nextInt();  
        System.out.println(" the maximum number of operations you can perform on the array are-"+maxOperations(array, k));
    }
}
