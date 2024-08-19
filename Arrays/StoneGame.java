package LeetcodePractice.Arrays;

import java.util.Scanner;

public class StoneGame {
    public static boolean stoneGame(int[] piles) {
        int count=1,a=0,b=0;
        int length=piles.length;
        for(int i=0;i<length;i++){
            if(count%2!=0){
                a+=Math.max(piles[i],piles[length-i-1]);
            }else{
                b+=Math.min(piles[i],piles[length-i-1]);
            }
            count++;
        }
        return a>b?true:false;
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
        System.out.println("Alice won the game ?-"+stoneGame(array));
    }
}
