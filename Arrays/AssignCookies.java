package LeetcodePractice.Arrays;
import java.util.*;
public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int m=0;
        int count=0;
        while(l<g.length && m<s.length){
            int child=g[l];
            int cookies=s[m];
            if(child>cookies) m++;
            if(child<=cookies){
                count++;
                l++;
                m++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of first Array");
        int length1=sc.nextInt();
        int[] array1=new int[length1];
        System.out.println("Enter the element in first array");
        for(int i=0;i<length1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of second Array");
        int length2=sc.nextInt();
        int[] array2=new int[length2];
        System.out.println("Enter the element in second array");
        for(int i=0;i<length2;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println("The Maximum Number of children get the cookies are-"+findContentChildren(array1, array2));
    }
}
