package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArray {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h= new HashSet<>();
        int n= nums1.length;
        int m= nums2.length;
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n && j<m){
            if(nums1[i]<nums2[j]) i++;
            else if(nums2[j]<nums1[i]) j++;
            else{
                h.add(nums1[i]);
                i++;
                j++;
            }
        }
        int k=0;
        int[] ans=new int[h.size()];
        for(int el : h){
            ans[k++]=el;
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
        int[] result=intersection(array1, array2);
        System.out.println("The new array which contain intersection element of both array is-");
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
