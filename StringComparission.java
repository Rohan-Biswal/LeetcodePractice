package LeetcodePractice;

import java.util.Scanner;

public class StringComparission {
    public static int compress(char[] chars){
        int i=1;
        int ans=0;
        int count=1;
        char v=chars[0];
        while(i<chars.length){
            if(v==chars[i]){
                count++;
            }else{
                v=chars[i];
                chars[ans++]=chars[i-1];
                if(count>1){
                    String str=String.valueOf(count);
                    for(char digit : str.toCharArray()){
                        chars[ans++]=digit;
                    }
                }
                count=1;
            }
            i++;
        }
        chars[ans++]=chars[i-1];
        if(count>1){
            String str= String.valueOf(count);
            for(char digit:str.toCharArray()){
                chars[ans++]=digit;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to compress");
        String charString=sc.nextLine();
        char[] chars=charString.toCharArray();
        System.out.println(" the new length of the array after compressing is-"+compress(chars));
        
    }
}
