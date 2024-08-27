package LeetcodePractice.Arrays;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int start =0,end=0;
        for(int i=0;i<n;i++){
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int count=1;
            int sum=0;
            for(int i=0;i<n;i++){
                if(sum+weights[i]<=mid){
                    sum+=weights[i];
                }else{
                    sum=weights[i];
                    count++;
                }
            }
            if(count>days){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return end;
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
        System.out.println("Enter the value of days");
        int days=sc.nextInt();
        System.out.println("The least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days is :-"+shipWithinDays(array, days));
    }
}
