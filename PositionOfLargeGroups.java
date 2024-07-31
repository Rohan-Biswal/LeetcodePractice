package LeetcodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans=new ArrayList<>();
        int start=0;
        char prev=s.charAt(0);
        for(int i=1;i<s.length();++i){
            if(prev!=s.charAt(i)){
                if(i-start>=3){
                    ans.add(Arrays.asList(start,i-1));
                }
                start=i;
                prev=s.charAt(i);
            }
        }
        if(s.length()-start>=3){
            ans.add(Arrays.asList(start,s.length()-1));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String String=sc.nextLine();
        System.out.println("The intervals of every large group in a String is-"+largeGroupPositions(String));
    }
}
