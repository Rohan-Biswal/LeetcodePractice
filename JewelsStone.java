package LeetcodePractice;
import java.util.*;
public class JewelsStone {

    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)) count++;
            }
        }
    return count;    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Jewels");
        String jewels=sc.nextLine();
        System.out.println("Enter the stones");
        String stones=sc.nextLine();
        System.out.println("Total number of stones which are jewels are-"+numJewelsInStones(jewels, stones));
    }
    
}
