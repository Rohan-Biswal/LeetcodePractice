package LeetcodePractice;
import java.util.*;
public class FindCommonCharacter {

    public static List<String> commonChars(String[] words) {
        int[] arr=new int[26];
        for(int i=0;i<words[0].length();i++){
            arr[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] freq=new int[26];
            for(int k=0;k<words[i].length();k++){
                freq[words[i].charAt(k)-'a']++;
            }
            for(int l=0;l<26;l++){
                arr[l]=Math.min(arr[l],freq[l]);
            }
        }
        List<String> ans= new ArrayList<>();
        for(int l=0;l<26;l++){
            if(arr[l]>0){
                Character ch=(char)(l+'a');
                for(int k=0;k<arr[l];k++){
                    ans.add(""+ch);
                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a string");
        int n=sc.nextInt();
        String[] string= new String[n];
        System.out.println("Enter the "+n+" string.");
        for(int i=0;i<n;i++){
            string[i]=sc.next();
        }
        System.out.println("All characters that show up in all strings within the words are-"+commonChars(string));
        
    }
    
}
