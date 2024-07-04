package LeetcodePractice.Arrays;
import java.util.*;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int length=nums.length;
        int[] newArr=new int[length+1];
        Arrays.fill(newArr,-1);
        for(int i=0;i<length;i++){
            newArr[nums[i]]=nums[i];
        }
        for(int i=0;i<newArr.length;i++){
            if(newArr[i]==-1) return i;
        }
        return 0;
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
        System.out.println("The missing element in the array is-"+missingNumber(array));
    }
}
