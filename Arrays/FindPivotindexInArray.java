package LeetcodePractice.Arrays;

import java.util.*;
public class FindPivotindexInArray {

    public static int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        for(int ele : nums) totalSum+=ele;
        for(int i=0;i<nums.length;leftSum+=nums[i++]){
            if(leftSum*2 == totalSum-nums[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the element in array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The Pivot Index in Array is-"+pivotIndex(array));
    }
    
}
