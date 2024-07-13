package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MaxSubArrayOne {

    public static double findMaxAverage(int[] nums, int k) {
        int wind=0,i=0,j=k-1;
        double max=Integer.MIN_VALUE;
        for(int z=0;z<k;z++){
            wind=wind+nums[z];
        }
        while(j!=nums.length){
            max=Math.max(max,(double)wind/k);
            j++;
            wind=wind-nums[i];
            i++;
            if(j!=nums.length)
            wind=wind+nums[j];  
        }
        return max;
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
        System.out.println("the maximum average value-"+findMaxAverage(array, k));
    }
}
