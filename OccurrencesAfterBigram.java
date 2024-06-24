package LeetcodePractice;
import java.util.*;

public class OccurrencesAfterBigram {

    public static String[] findOcurrences(String text, String first, String second) {
        String[] words=text.split(" ");
        List<String> ans= new ArrayList<>();
        for(int i=0;i<=words.length-3;i++){
            if(words[i].equals(first) && words[i+1].equals(second)){
                ans.add(words[i+2]);
            }
        }
        return ans.toArray(new String[0]);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String text=sc.nextLine();
        System.out.println("Enter the First Word");
        String firstWord=sc.nextLine();
        System.out.println("Enter the Second Word");
        String secondWord=sc.nextLine();
        System.out.println("the third word which comes after first and second in the text are-");
        String[] result=findOcurrences(text, firstWord, secondWord);
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }
    
}
