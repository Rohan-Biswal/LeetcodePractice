package LeetcodePractice;
import java.util.*;
public class NumberOfLinesToWrite {
    public static int[] numberOfLines(int[] widths, String s) {
        int[] ans=new int[2];
        int curValue=0;
        int nextValue=0;
        int line=1;
        char[] sChar=s.toCharArray();
        for(int i=0;i<sChar.length;i++){
            nextValue=widths[sChar[i]-'a'];
            if(curValue+nextValue<=100){
                curValue+=nextValue;
            }
            else{
                line++;
                curValue=nextValue;
            }
        }
        ans[0]=line;
        ans[1]=curValue;
        return ans;
    }

    public static void main(String[] args) {
        int[] width={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s="bbbcccdddaaa";
        int[] result=numberOfLines(width,s);
        System.out.println("the number of lines are-"+result[0]+" value in last line is-"+result[1]);
    }
}
