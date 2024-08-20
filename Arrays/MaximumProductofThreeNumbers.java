package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductofThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int m1 = nums[n-1]*nums[n-2]*nums[n-3];
        int m2 = nums[0]*nums[1]*nums[n-1];
        if(m1>m2){
            return m1;
        }
        else{
            return m2;
        }
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
        System.out.println("Three numbers whose product is maximum.The product is -"+maximumProduct(array));
    }
}
