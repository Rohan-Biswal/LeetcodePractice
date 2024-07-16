package LeetcodePractice.Arrays;

import java.util.Scanner;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=duration;
        for(int i=1;i<timeSeries.length;i++){
            ans+=Math.min(duration,(timeSeries[i]-timeSeries[i-1]));
        }
        return ans;
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
        System.out.println("Enetr the Duration");
        int duration=sc.nextInt();
        System.out.println("the total number of seconds that Ashe is poisoned is-"+findPoisonedDuration(array, duration));
    }
}
