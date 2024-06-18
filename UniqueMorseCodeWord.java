package LeetcodePractice;
import java.util.*;

public class UniqueMorseCodeWord {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] strArray= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",        "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set= new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char c :str.toCharArray()){
                sb.append(strArray[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
    public static void main(String[] args) {
        String[] word={"gin","zen","gig","msg"};
        System.out.println("There are "+uniqueMorseRepresentations(word)+" different transformations");
        
    }
    
}
