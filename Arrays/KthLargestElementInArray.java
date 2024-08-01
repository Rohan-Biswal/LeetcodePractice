package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int r=nums.length-k;
        return nums[r];
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
        System.out.println("The "+k+" Largest element in the array is-"+findKthLargest(array, k));
    }
}
