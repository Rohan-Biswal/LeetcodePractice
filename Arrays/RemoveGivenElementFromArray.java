package LeetcodePractice.Arrays;
import java.util.*;
public class RemoveGivenElementFromArray {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        int count=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the value you want to delete from array");
        int value=sc.nextInt();
        System.out.println("Enete the length of your array");
        int length=sc.nextInt();
        System.out.println("Enetr the "+length+" element of array");
        int[] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("After Removing the given element- "+value+" we have "+removeElement(array, value)+" elements present in array.");
        
    }
}
