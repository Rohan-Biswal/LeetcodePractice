package LeetcodePractice.Arrays;

import java.util.Scanner;

public class BeautifulArrangementTwo {
    public static int[] constructArray(int n, int k) {
        int[] ans=new int[n];
        int left=1,right=n;
        int i=0;
        while(i<n){
            if(k>1){
                ans[i++]=(k%2==0)?right--:left++;
                k--;
            }else{
                ans[i++]=left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int[] result=constructArray(n,k);
        System.out.println("The List of beautiful arragement is-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
