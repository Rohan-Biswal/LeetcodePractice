package LeetcodePractice.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class TemperatureCompare {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st= new Stack<>();
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of days recorded for temperature");
        int length=sc.nextInt();
        int[] temperatures=new int[length];
        System.out.println("Enter the temperatures of all the days");
        for(int i=0;i<length;i++){
            temperatures[i]=sc.nextInt();
        }int [] result= dailyTemperatures(temperatures);
        System.out.println("The array such that number of days you have to wait after the ith day to get a warmer temperature is-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
