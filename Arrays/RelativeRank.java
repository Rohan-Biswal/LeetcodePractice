package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RelativeRank {

    public static String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];
        int[] temp= Arrays.copyOf(score,n);
        Arrays.sort(temp);
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i==(n-1)) map.put(temp[i],"Gold Medal");
            else if(i==n-2) map.put(temp[i],"Silver Medal");
            else if(i==n-3) map.put(temp[i],"Bronze Medal");
            else{
                map.put(temp[i],Integer.toString(n-i));
            }
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(score[i]);
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
        String[] result=findRelativeRanks(array);
        System.out.println(" The rank of athlete are-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
