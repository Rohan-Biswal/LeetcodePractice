package LeetcodePractice.Arrays;

import java.util.Scanner;

public class RemoveDuplicatesfromSortedArrayTwo {
    public static int removeDuplicates(int[] nums) {
        int count=1;
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]) count++;
            else count=1;
            if(count<3){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
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
        System.out.println("After removing duplicates the size of array is:-"+removeDuplicates(array));
    }
}
