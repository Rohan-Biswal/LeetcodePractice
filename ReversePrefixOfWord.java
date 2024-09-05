package LeetcodePractice;

import java.util.Scanner;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j != -1) {
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.nextLine();

        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        System.out.println("The resulting string after reversed prefix of word is:-"+reversePrefix(word, ch));
    }
}
