package LeetcodePractice.Arrays;

import java.util.Scanner;

public class DuplicateZeros {
    public static int[] duplicateZeros(int[] arr) {
        int n= arr.length;
        int[] tempArr=new int [n];
        for(int i=0, tempIndex=0;tempIndex<n;i++){
            tempArr[tempIndex]=arr[i];
            if(tempArr[tempIndex++]==0 && tempIndex<n){
                tempArr[tempIndex++]=0;
            }
        }
        // System.arraycopy(tempArr,0,arr,0,n);
        return tempArr;
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
        int[]result=duplicateZeros(array);
        System.out.println("Array After making Zeros Duplicates is:-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
