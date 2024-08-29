package LeetcodePractice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new List[nums.length + 1];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans=new int[k];
        int pos=0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int j=0;j<bucket[i].size() && pos<k;j++){
                    ans[pos++]=bucket[i].get(j);
                }
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
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int[] result=topKFrequent(array, k);
        System.out.println("The k most frequent elements-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
