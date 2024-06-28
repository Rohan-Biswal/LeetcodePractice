package LeetcodePractice.Arrays;
import java.util.*;
public class RemoveDuplicateFromArray {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enete the length of your array");
        int length=sc.nextInt();
        System.out.println("Enetr the "+length+" element of array");
        int[] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The number of unique element in the array are-"+removeDuplicates(array));
    }
}
