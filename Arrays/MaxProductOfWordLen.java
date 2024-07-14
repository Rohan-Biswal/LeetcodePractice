package LeetcodePractice.Arrays;

import java.util.Scanner;

public class MaxProductOfWordLen {
    public static int maxProduct(String[] words) {
        int n=words.length;
        int[] masks=new int[n];
        for(int i=0;i<n;i++){
            for(char c:words[i].toCharArray()){
                masks[i]|=(1<<(c-'a'));
            }
        }
        int largest=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((masks[i]&masks[j])==0){
                    largest=Math.max(largest,words[i].length()*words[j].length());
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        String[] array=new String[length];
        System.out.println("Enter the value in array");
        for(int i=0;i<length;i++){
            array[i]=sc.next();
        }
        System.out.println(" the maximum value of length where the two words do not share common letters is-"+maxProduct(array));
    }
}
