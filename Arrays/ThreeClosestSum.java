package LeetcodePractice.Arrays;
import java.util.*;
public class ThreeClosestSum {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                   closestSum=sum;
                }
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closestSum;
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
        System.out.println("The sum that is closest to the target is-"+threeSumClosest(array, target));
        
    }
}
