package LeetcodePractice.Arrays;

import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        int max_len = 0;
        for (String word : wordDict) {
            max_len = Math.max(max_len, word.length());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(i - max_len - 1, 0); j--) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String word=sc.next();
        System.out.println("enter the length of List");
        int lenOfList=sc.nextInt();
        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter the words in the dictionary:");
        for (int i = 0; i < lenOfList; i++) {
            String words = sc.next();
            wordDict.add(words);
        }
        System.out.println("Can the string be segmented?-" +wordBreak(word, wordDict));
        
    }
}
