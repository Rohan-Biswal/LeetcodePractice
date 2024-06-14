package LeetcodePractice;
import java.util.*;

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
        char firstChar=word.charAt(0);
        int wordLength=word.length();
        int capitalCount=0;
        int smallCount=0;
        for(int i=0;i<wordLength;i++){
            firstChar=word.charAt(i);
            if(firstChar>='a' && firstChar<='z') smallCount++;
            else capitalCount++;
        }
        if(capitalCount==wordLength|| smallCount==wordLength) return true;
        firstChar=word.charAt(0);
        if(capitalCount==1&& firstChar>='A'&& firstChar<='Z') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string you want to check is in correct capita form");
        String word=sc.nextLine();
        System.out.println("The given word is "+detectCapitalUse(word)+" in capital form");
    }
}
