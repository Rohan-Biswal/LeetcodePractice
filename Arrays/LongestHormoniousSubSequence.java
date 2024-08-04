package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestHormoniousSubSequence {
    public static int findLHS(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                ans=Math.max(ans,map.get(key)+map.get(key+1));
            }
        }
        return ans;
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
        System.out.println("The length of its longest harmonious subsequence among all its possible subsequences is-"+findLHS(array));
    }
}
