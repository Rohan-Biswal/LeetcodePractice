package LeetcodePractice.Arrays;
import java.util.*;
public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2= nums2.length;
        int tl=l1+l2;
        int j=0;
        int[] newArr= Arrays.copyOf(nums1,tl);
        for(int i=l1;i<tl;i++){
            newArr[i]=nums2[j++];
        }
        Arrays.sort(newArr);
        if(tl%2==0){
            int k=tl/2;
            int l=newArr[k-1]+newArr[k];
            double ans=l/2.0000;
            return ans;
        }else{
            int k=tl/2;
            double ans=newArr[k];
            return ans;
        }
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
        System.out.println("The median after merging th sorted array is-"+findMedianSortedArrays(array1, array2));
    }
}
