package LeetcodePractice;
import java.util.*;
public class WordFormationFromCharacter {

    public static int countCharacters(String[] words, String chars) {
        int arr1[]=new int[26];
        for(int i=0;i<chars.length();i++){
            char ch = chars.charAt(i);
            arr1[ch-97]++;
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            String s= words[i];
            int[] arr2= new int[26];
            for(int j=0;j<s.length();j++){
                arr2[s.charAt(j)-97]++;
            }
            boolean flag=true;
            for(int j=0;j<26;j++){
                if(arr1[j]<arr2[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==true) ans=ans+s.length();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        String[] words=new String[n];
        System.out.println("Enter the "+n+" words in Array");
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        System.out.println("enter the character");
        String chars=sc.next();
        System.out.println("The sum of lengths of all good strings in words="+countCharacters(words, chars));
    }
}
