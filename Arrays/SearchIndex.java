package LeetcodePractice.Arrays;
import java.util.*;
public class SearchIndex {
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return start;
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
        int target=sc.nextInt();
        System.out.println("The element is found at index-"+searchInsert(array, target));
        
    }
}
