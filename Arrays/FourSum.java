package LeetcodePractice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    for(int i = 0; i < n; i++){
        if(i != 0 && nums[i] == nums[i - 1]) continue;
        for(int j = i + 1; j < n; j++){
            if(j != i + 1 && nums[j] == nums[j - 1]) continue;
            int k = j + 1;
            int l = n - 1;
            while(k < l){
                long sum = nums[i] + nums[j];
                sum += nums[k];
                sum += nums[l];
                if(sum == target){
                    list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    k++;
                    l--;
                    while(k < l && nums[k] == nums[k - 1]) k++;
                    while(k < l && nums[l] == nums[l + 1]) l--;
                }else if(sum < target){
                    k++;
                }else{
                    l--;
                }
            }
        }
    }
    return list;
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
        System.out.println("Enetr the Target Value");
        int target=sc.nextInt();
        System.out.println(" An array of all the unique quadruplets-"+fourSum(array, target)); 
    }
}
