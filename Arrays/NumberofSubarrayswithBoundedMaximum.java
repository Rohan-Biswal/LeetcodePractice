package LeetcodePractice.Arrays;

import java.util.Scanner;

public class NumberofSubarrayswithBoundedMaximum {
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans=0,low=0,mid=0;
        for(int num :  nums){
            if(num>right) mid=0;
            else ans+=++mid;
            if(num>=left) low=0;
            else ans-=++low;
        }
        return ans;
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
        System.out.println("enetr the value of left");
        int left=sc.nextInt();
        System.out.println("enetr the value of right");
        int right=sc.nextInt();
        System.out.println("The number of contiguous non-empty subarrays is-"+numSubarrayBoundedMax(array, left, right));
    }
}
