package LeetcodePractice.Arrays;

import java.util.Scanner;

public class SortArrayByParityTwo {
    public static int[] sortArrayByParityII(int[] nums) {
        int p1=0;
        int p2=1;
        int n=nums.length;
        while(p1<n && p2<n){
            while(p1<n && nums[p1]%2==0)p1+=2;
            while(p2<n && nums[p2]%2!=0)p2+=2;
            if(p1>=n || p2>=n)break;
            int x=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=x;
        }
        return nums;
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
        System.out.println("Array that satisfies this condition is-");
        int[] result=sortArrayByParityII(array);
        for(int i=0;i<length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
