package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MaxLenOfRepeatingSubArray {
    public static int findLength(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int ans=0;
        for(int i=1-l1;i<l1+l2;i++){
            int c=0;
            for(int j=0;j<l1;j++){
                if(i+j<0) continue;
                else if(i+j>=l2) break;
                else if(nums2[i+j]==nums1[j]){
                    c++;
                    ans=Math.max(c,ans);
                }
                else c=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of first Array");
        int length1=sc.nextInt();
        int[] array1=new int[length1];
        System.out.println("Enter the element in first array");
        for(int i=0;i<length1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of second Array");
        int length2=sc.nextInt();
        int[] array2=new int[length2];
        System.out.println("Enter the element in second array");
        for(int i=0;i<length2;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println("The maximum length of a subarray that appears in both arrays is->"+findLength(array1, array2));
    }
}
