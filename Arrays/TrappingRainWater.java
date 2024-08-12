package LeetcodePractice.Arrays;

import java.util.Scanner;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int lmax=0,rmax=0,left=0,right=height.length-1;
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                if(lmax>height[left]) water+=lmax-height[left];
                else lmax=height[left];
                left++;
            }else{
                if(rmax>height[right]) water+=rmax-height[right];
                else rmax=height[right];
                right--;
            }
        }
        return water;
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
        System.out.println("Water it can trap after raining is-"+trap(array));
    }
}
