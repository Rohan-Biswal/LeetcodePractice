package LeetcodePractice.Arrays;

import java.util.*;

public  class MajorityElementInArray {

    public static int majorityElement(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        return nums[length/2]; 
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
        System.out.println("The majority element comes in the array is-"+majorityElement(array));
        
    }
}
