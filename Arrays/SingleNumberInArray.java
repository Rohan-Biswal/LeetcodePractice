package LeetcodePractice.Arrays;

import java.util.Scanner;

public class SingleNumberInArray {
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the value in array1");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The element comes single time in the array is-"+singleNumber(array));
    }
}
