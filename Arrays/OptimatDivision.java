package LeetcodePractice.Arrays;

import java.util.Scanner;

public class OptimatDivision {
    public static String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder().append(nums[0]);
        int n=nums.length;
        if(n==1) return sb.toString();
        if(n==2) return sb.append("/").append(nums[1]).toString();
        sb.append("/(");
        for(int i=1;i<n;i++){
            sb.append(nums[i]).append("/");
        }
        sb.setCharAt(sb.length()-1,')');
        return sb.toString();
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
        System.out.println("the corresponding expression that has the maximum value in string format is->"+optimalDivision(array));
    }
}
