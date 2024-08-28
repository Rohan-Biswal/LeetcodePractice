package LeetcodePractice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        countPer(nums,result,new ArrayList<>());
        return result;
        
    }
    public static void countPer(int[] nums,List<List<Integer>> result,List<Integer> list){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int num: nums){
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            countPer(nums,result,list);
            list.remove(list.size()-1);
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
        System.out.println("All the possible permutations is :-"+permute(array));
    }
}
