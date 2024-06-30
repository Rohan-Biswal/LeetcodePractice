package LeetcodePractice.Arrays;
import java.util.*;
public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        int buyPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(buyPrice > prices[i]){
                buyPrice=prices[i];
            }
            profit=Math.max(profit,prices[i]-buyPrice);
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the value of stocks per day in array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The maximun value when stock is Buy and Sell is-"+maxProfit(array));
    }
}
