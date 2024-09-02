package LeetcodePractice.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> hs=new HashSet<>();
        for(int n : candyType){
            hs.add(n);
        }
        int n=candyType.length/2;
        if(n>=hs.size()){
            return hs.size();
        }
        else{
            return n;
        }
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
        System.out.println("The maximum number of different types of candies she can eat if she only eats n / 2 of them is :-"+distributeCandies(array));
    }
}
