package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int remainder=prefix % k;
            if(remainder<0) remainder+=k;
            if(map.containsKey(remainder)){
                if(i-map.get(remainder) >1) return true;
            }else{
                map.put(remainder,i);
            }
        }
        return false;
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
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Is nums array has a good subarray :-"+checkSubarraySum(array, k));
    }
}
