package LeetcodePractice.Arrays;
import java.util.*;

public class SummaryRange {
    public static List<String> summaryRanges(int[] nums) {
        StringBuilder s= new StringBuilder("");
        List<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]-1){
                s.append(nums[i]).append("->");
                while(i<nums.length-1 && nums[i]==nums[i+1]-1){
                    i++;
                }
                s.append(nums[i]);
                list.add(s.toString());
                s.setLength(0);
            }else{
                list.add(nums[i]+"");
            }
        }
        return list;
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
        System.out.println("Summary Range of Array is-"+summaryRanges(array));

    }
    
}