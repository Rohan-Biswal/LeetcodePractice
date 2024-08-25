package LeetcodePractice.Arrays;

import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAndReplaceinString {
    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<indices.length;i++){
            if(s.startsWith(sources[i],indices[i])){
                map.put(indices[i],i);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();){
            if(!map.containsKey(i)){
                sb.append(s.charAt(i));
                i++;
            }else{
                sb.append(targets[map.get(i)]);
                i+=sources[map.get(i)].length();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();

        System.out.println("Enter the length of indices Array");
        int Indlength=sc.nextInt();
        int[] indices=new int[Indlength];
        System.out.println("Enter the element in array");
        for(int i=0;i<Indlength;i++){
            indices[i]=sc.nextInt();
        }

        System.out.println("Enter the length of sources Array");
        int Srclength=sc.nextInt();
        String[] source=new String[Srclength];
        System.out.println("Enter the element in array");
        for(int i=0;i<Srclength;i++){
            source[i]=sc.next();
        }

        System.out.println("Enter the length of Target Array");
        int Tarlength=sc.nextInt();
        String[] target=new String[Tarlength];
        System.out.println("Enter the element in array");
        for(int i=0;i<Srclength;i++){
            target[i]=sc.next();
        }
        System.out.println("The resulting string after performing all replacement operations on s is-"+findReplaceString(s, indices, source, target));
    }
}
