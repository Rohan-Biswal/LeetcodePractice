package LeetcodePractice;

import java.util.*;

class KeyboardRow{

    public static String[] findWords(String[] words) {
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int length1=0,length2=0,length3=0;
            for(int j=0;j<word.length();j++){
                char a= Character.toLowerCase(word.charAt(j));
                if("qwertyuiop".contains(a+""))length1++;
                if("asdfghjkl".contains(a+""))length2++;
                if("zxcvbnm".contains(a+""))length3++;
            }
            if(length1==word.length() || length2==word.length()||length3==word.length()){
                list.add(word);
            }
        }
        String[] result=new String[list.size()];
        result=list.toArray(result);
        return result;
    }
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[]result=findWords(words);
        System.out.print("The word which are in one row of a keyboard is-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}