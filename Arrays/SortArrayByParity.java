package LeetcodePractice.Arrays;

import java.util.Scanner;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j= nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
            }
            else if(nums[j]%2!=0){
                j--;
            }
            else{
                swap(nums,i,j);
                i++;
                j--;
            }
        }
        return nums;
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the element in array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }int [] result= sortArrayByParity(array);
        System.out.println("The array after seprating even element in front and odd element at last is-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
