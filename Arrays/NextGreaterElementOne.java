package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NextGreaterElementOne {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        int n1=nums1.length,n2=nums2.length;
        int ans[]=new int[n1];
        int i=0,j=1;
        while(i<n2){
            if(j==n2){
                map.put(nums2[i],-1);
                i++;j=i+1;
            }
            else if(nums2[i]<nums2[j]){
                map.put(nums2[i],nums2[j]);
                i++;j=i+1;
            }
            else if(nums2[i]>nums2[j]) {
                j++;
            }
        }
        
        for(int k=0;k<n1;k++){
            ans[k]=map.get(nums1[k]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first Array");
        int length1=sc.nextInt();
        int[] array1=new int[length1];
        System.out.println("Enter the value in first Array");
        for(int i=0;i<length1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of second Array");
        int length2=sc.nextInt();
        int[] array2=new int[length2];
        System.out.println("Enter the value in second Array");
        for(int i=0;i<length2;i++){
            array2[i]=sc.nextInt();
        }
        int[] result=nextGreaterElement(array1, array2);
        System.out.println("If next great enement will present it will show or  If there is no next greater element, then the answer is-1 ");
        System.out.println("Lets see the array");
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
