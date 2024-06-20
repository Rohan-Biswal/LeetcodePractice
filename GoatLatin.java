package LeetcodePractice;
import java.util.*;
public class GoatLatin {

    public static String toGoatLatin(String sentence) {
        String vowels="aeiouAEIOU";
        StringBuilder goatLatin = new StringBuilder();
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            char firstChar=word.charAt(0);
            if(vowels.indexOf(firstChar)!=-1){
                goatLatin.append(word);
            }else{
                goatLatin.append(word.substring(1)).append(firstChar);
            }
            goatLatin.append("ma").append("a".repeat(i+1));
            if(i<words.length-1){
                goatLatin.append(" ");
            }
        }
        return goatLatin.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to convert into goat latin");
        String string=sc.nextLine();
        System.out.println("The string after converting into goat latin is-"+toGoatLatin(string));
    }
}
