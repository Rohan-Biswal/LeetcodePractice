package LeetcodePractice.Arrays;

import java.util.Scanner;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        int total=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            int net=gas[i]-cost[i];
            tank+=net;
            total+=net;
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }
        if(total<0){
            return -1;
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of first Array");
        int length1=sc.nextInt();
        int[] array1=new int[length1];
        System.out.println("Enter the element in first array");
        for(int i=0;i<length1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of second Array");
        int length2=sc.nextInt();
        int[] array2=new int[length2];
        System.out.println("Enter the element in second array");
        for(int i=0;i<length2;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println("The starting gas station's index if you can travel around the circuit once in the clockwise direction is ="+canCompleteCircuit(array1, array2));
    }
}
