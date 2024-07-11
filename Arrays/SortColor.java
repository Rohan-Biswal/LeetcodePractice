package LeetcodePractice.Arrays;

import java.util.Scanner;

public class SortColor {
    public static int[] sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1;
        int curr = 0;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                nums[curr++] = nums[p0];
                nums[p0++] = 0;
            } else if (nums[curr] == 2) {
                nums[curr] = nums[p2];
                nums[p2--] = 2;
            } else {
                curr++;
            }
        }
        return nums;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the value of stocks per day in array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        int[] result=sortColors(array);
        System.out.println("The sorted color in array-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
