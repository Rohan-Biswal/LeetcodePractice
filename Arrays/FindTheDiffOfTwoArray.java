package LeetcodePractice.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindTheDiffOfTwoArray {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1= new HashSet<>();
        Set<Integer> s2= new HashSet<>();
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for(int num :nums1) s1.add(num);
        for(int num :nums2) s2.add(num);
        for(int num:s1){
            if(!s2.contains(num))
            ans.get(0).add(num);
        }
        for(int num:s2){
            if(!s1.contains(num))
            ans.get(1).add(num);
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
        System.out.println("The Difference Of Array is-"+findDifference(array1, array2));
    }
}
