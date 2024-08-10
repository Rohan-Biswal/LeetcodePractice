package LeetcodePractice.Arrays;

import java.util.Scanner;

public class PeakIndexinaMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>peak){
                peak=arr[i];
                index=i;
            }
        }
        return index;
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
        System.out.println("The index of the peak element is-"+peakIndexInMountainArray(array));
    }
}
