package LeetcodePractice.Arrays;

import java.util.Scanner;

public class ProductOfArrEcptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] pre=new int[l];
        int[] suf= new int[l];
        pre[0]=1;
        suf[l-1]=1;
        for(int i=1;i<l;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=l-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        int[] ans = new int[l];
        for(int i=0;i<l;i++){
            ans[i]=pre[i]*suf[i];
        }
        return ans;
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
        int[] result=productExceptSelf(array);
        System.out.println("An array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. are-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
