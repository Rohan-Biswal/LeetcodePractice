package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int[] minCoins= new int[amount+1];
        Arrays.fill(minCoins,amount+1);
        minCoins[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    minCoins[i]=Math.min(minCoins[i],1+minCoins[i-coins[j]]);
                }
            }
        }
        return minCoins[amount]!=amount + 1?minCoins[amount]:-1;
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
        System.out.println("Enter the value of amount");
        int amount=sc.nextInt();
        System.out.println("The fewest number of coins that you need to make up that amount is-"+coinChange(array, amount));
    }
}
