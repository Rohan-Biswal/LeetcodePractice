package LeetcodePractice.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMissMatch {
    public static int[] findErrorNums(int[] nums) {
        int[] rep=new int[2];
        Set<Integer> set= new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                rep[0]=num;
            }
            set.add(num);
        }
        for(int num=1;num<=nums.length;num++){
            if(!set.contains(num)) rep[1]=num;
        }
        return rep;
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
        int[] result=findErrorNums(array);
        System.out.println("the number that occurs twice and the number that is missing is-" +"["+result[0]+","+result[1]+"]");
    }
}
