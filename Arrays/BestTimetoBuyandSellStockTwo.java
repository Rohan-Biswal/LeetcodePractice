package LeetcodePractice.Arrays;

import java.util.Scanner;

public class BestTimetoBuyandSellStockTwo {
    public static int maxProfit(int[] prices) {
        int max=0;
        int start=prices[0];
        for(int i=1;i<prices.length;i++){
            if(start<prices[i]){
                max+=prices[i]-start;
            }
            start=prices[i];
        }
        return max;
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
        System.out.println("The maximum profit you can achieve is :-"+maxProfit(array));
    }
}
