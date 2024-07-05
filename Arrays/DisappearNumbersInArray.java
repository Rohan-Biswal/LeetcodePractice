package LeetcodePractice.Arrays;

import java.util.*;

public class DisappearNumbersInArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isAvailable = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isAvailable[nums[i]-1]=true;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!isAvailable[i]){
                list.add(i+1);
            }
        }
        return list;
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
        System.out.println("All the number that do not appear in array are-"+findDisappearedNumbers(array)); 
    }
}
