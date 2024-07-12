package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainDuplicateTwo {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if((i-map.get(nums[i]))<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
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
        System.out.println("there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k is-"+containsNearbyDuplicate(array, k));
    }
}
