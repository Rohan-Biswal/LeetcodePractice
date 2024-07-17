package LeetcodePractice.Arrays;

import java.util.Scanner;

public class CanPlacePlant {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && ( i==flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
                if(n==0) return true;
            }
        }
        return false;
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
        System.out.println("Enetr the number of flower you want to plant");
        int flower=sc.nextInt();
        System.out.println("are yor able to plant number of flower that you want to plant?--"+canPlaceFlowers(array,flower));
    }
}
