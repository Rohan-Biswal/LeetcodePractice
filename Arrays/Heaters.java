package LeetcodePractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Heaters {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int l=0;
        int r=Math.max(heaters[heaters.length-1],houses[houses.length-1]-houses[0]);
        int min=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            int houseInd=0;
            int heatInd=0;
            for(;houseInd<houses.length && heatInd<heaters.length;houseInd++){
                if(houses[houseInd]<heaters[heatInd]-mid) break;
                if(houses[houseInd]>heaters[heatInd]+mid){
                    heatInd++;
                    houseInd--;
                }
            }
            if(houseInd==houses.length){
                min=Math.min(mid,min);
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of houses array");
        int housesLength=sc.nextInt();
        int[] houses=new int[housesLength];
        System.out.println("Enter the element in houses array");
        for(int i=0;i<housesLength;i++){
            houses[i]=sc.nextInt();
        }

        System.out.println("Enter the length of heaters array");
        int heaterslength=sc.nextInt();
        int[] heaters=new int[heaterslength];
        System.out.println("Enter the element in heaters array");
        for(int i=0;i<heaterslength;i++){
            heaters[i]=sc.nextInt();
        }
        System.out.println("The minimum radius standard of heaters so that those heaters could cover all houses is:-"+findRadius(houses, heaters));
    }
}
