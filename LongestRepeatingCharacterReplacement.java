package LeetcodePractice;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int ans=0;
        int n=s.length();
        for(char c='A';c<='Z';c++){
            int i=0,j=0,replace=0;
            while(j<n){
                if(s.charAt(j)==c){
                    j++;
                }else if(replace<k){
                    j++;
                    replace++;
                }else if(s.charAt(i)==c){
                    i++;
                }else{
                    i++;
                    replace--;
                }
                ans=Math.max(ans,j-i);
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = sc.nextLine();
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("The length of the longest substring containing the same letter you can get after performing the above operations is :-"+characterReplacement(string,k));
    }
}
