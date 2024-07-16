package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FourSumTwo {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k : nums3){
            for(int l : nums4){
                map.put(k+l,map.getOrDefault(k+l,0)+1);
            }
        }
        int count =0;
        for(int i:nums1){
            for(int j: nums2){
                count+=map.getOrDefault(-(i+j),0);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array1");
        int length1=sc.nextInt();
        int[] array1=new int[length1];
        System.out.println("Enter the value in Array1");
        for(int i=0;i<length1;i++){
            array1[i]=sc.nextInt();
        }
        
        System.out.println("Enter the length of Array2");
        int length2=sc.nextInt();
        int[] array2=new int[length2];
        System.out.println("Enter the value in Array2");
        for(int i=0;i<length2;i++){
            array1[i]=sc.nextInt();
        }

        System.out.println("Enter the length of Array3");
        int length3=sc.nextInt();
        int[] array3=new int[length3];
        System.out.println("Enter the value in Array3");
        for(int i=0;i<length3;i++){
            array3[i]=sc.nextInt();
        }
        
        System.out.println("Enter the length of Array4");
        int length4=sc.nextInt();
        int[] array4=new int[length4];
        System.out.println("Enter the value in Array4");
        for(int i=0;i<length4;i++){
            array4[i]=sc.nextInt();
        }
        System.out.println("the number of tuples (i, j, k, l) such that:-nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0 are-"+fourSumCount(array1, array2, array3, array4));
    }
}
