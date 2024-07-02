package LeetcodePractice.Arrays;
import java.util.*;
public class SearchInRotateArray {
    public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
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
        System.out.println("The targer is found at index-"+search(array, target));
    }
    
}
