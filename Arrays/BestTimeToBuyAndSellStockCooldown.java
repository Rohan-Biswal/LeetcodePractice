package LeetcodePractice.Arrays;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockCooldown {
    public static int maxProfit(int[] prices) {
        int sell=0,prev_sell=0,buy=Integer.MIN_VALUE,prev_buy;
        for(int price : prices){
            prev_buy=buy;
            buy=Math.max(prev_sell-price,prev_buy);
            prev_sell=sell;
            sell=Math.max(prev_buy+price,prev_sell);
        }
        return sell;
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
        System.out.println("The maximum profit you can achieve is->"+maxProfit(array));
    }
}
