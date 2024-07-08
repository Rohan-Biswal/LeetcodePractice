package LeetcodePractice.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateInArray {
    public static int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the value of stocks per day in array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The duplicate value in array is-"+findDuplicate(array));
    }
}
