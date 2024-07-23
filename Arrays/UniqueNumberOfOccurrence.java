package LeetcodePractice.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberOfOccurrence {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int num:map.values()){
            set.add(num);
        }
        return map.size()== set.size();
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
        System.out.println("if the number of occurrences of each value in the array is unique?->"+uniqueOccurrences(array));
    }
}
