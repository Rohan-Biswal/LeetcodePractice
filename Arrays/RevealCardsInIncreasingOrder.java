package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevealCardsInIncreasingOrder {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int[] result=new int[n];
        Arrays.sort(deck);
        return revealOrder(deck,result,0,0,false);
    }
    private static int[] revealOrder(int[] deck,int[] result,int indexDeck,int indexResult,boolean skip){
        int n=deck.length;
        if(indexDeck==n) return result;
        while(indexResult<n){
            if(result[indexResult]==0){
                if(!skip){
                    result[indexResult]=deck[indexDeck];
                    indexDeck++;
                }
                skip=!skip;
            }
            indexResult++;
        }
        return revealOrder(deck,result,indexDeck,0,skip);
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
        System.out.println("An ordering of the deck that would reveal the cards in increasing order is-");
        int[] result=deckRevealedIncreasing(array);
        for(int i=0;i<length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
