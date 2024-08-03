package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumEqualToK {
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
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
        System.out.println("Enter the value of k.");
        int k=sc.nextInt();
        System.out.println(" the total number of subarrays whose sum equals to k is-"+subarraySum(array, k));
    }
}
