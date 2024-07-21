package LeetcodePractice.Arrays;

import java.util.Scanner;

public class FindTheHigestAltitude {
    public static int largestAltitude(int[] gain) {
        int l=gain.length;
        int tempSum=0;
        int max=0;
        int[] newArr= new int[l+1];
        newArr[0]=0;
        for(int i=0;i<l;i++){
            tempSum=tempSum+gain[i];
            newArr[i+1]=tempSum;
            if(tempSum>max) max=tempSum;
        }
        return max;
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
        System.out.println("The highest altitude of a point is->"+largestAltitude(array));
    }
}
