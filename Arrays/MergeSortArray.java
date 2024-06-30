package LeetcodePractice.Arrays;
import java.util.*;
public class MergeSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0, i=m; j<n; j++){
            nums1[i++]=nums2[j];
        }
        Arrays.sort(nums1);
        System.out.println("After merging sorted array is-");
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array1");
        int length1=sc.nextInt();
        int[] array1=new int[length1];
        System.out.println("Enter the value in array1");
        for(int i=0;i<length1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the value of M");
        int m=sc.nextInt();
        System.out.println("Enter the length of Array2");
        int length2=sc.nextInt();
        int[] array2=new int[length2];
        System.out.println("Enter the value in array2");
        for(int i=0;i<length2;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        merge(array1, m, array2, n);
    }
}
