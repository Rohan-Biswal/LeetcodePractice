package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsuctiveSequence {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=1;
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-nums[i-1]==1){
                count++;
                max=Math.max(count,max);
            }else{
                count=1;
            }
        }
        return max;
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
        System.out.println("The length of the longest consecutive elements sequence is-"+longestConsecutive(array));
    }
}