package LeetcodePractice.Arrays;

import java.util.*;;

public class RotateArray {

    public  static void rotate(int[] nums, int k) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
            System.out.print(nums[i]+" ");
        }
        
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
        System.out.println("Enter the target that you want find it.");
        int rotationCount=sc.nextInt();
        System.out.println("The array after rotaion "+rotationCount+" times is");
        rotate(array, rotationCount);
    }
}
