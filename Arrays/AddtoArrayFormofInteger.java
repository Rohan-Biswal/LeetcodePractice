package LeetcodePractice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddtoArrayFormofInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = n - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }
            list.add(0, k % 10);
            k /= 10;
            i--;
        }
        return list;
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
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("The array-form of the integer num + k is :-"+addToArrayForm(array,k));
    }
}
