package LeetcodePractice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FindDuplicateOne{
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=Math.abs(nums[i]);
            if(nums[x-1]<0){
                ans.add(x);
            }
            nums[x-1]*=-1;
        }
        return ans;
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
        System.out.println("Duplicate Elements are-"+findDuplicates(array));
        
    }
}