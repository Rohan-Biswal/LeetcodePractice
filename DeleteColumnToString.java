package LeetcodePractice;
import java.util.*;
public class DeleteColumnToString {

    public static int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            int temp=0;
            for(int j=0;j<strs.length;j++){
                int a=strs[j].charAt(i);
                if(a>=temp){
                    temp=a;
                }
                else{
                    count++;
                    break;
                }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a string");
        int n=sc.nextInt();
        String[] string= new String[n];
        System.out.println("Enter the "+n+" string of simailar length");
        for(int i=0;i<n;i++){
            string[i]=sc.next();
        }
        System.out.println("The number of columns that you will delete are-"+minDeletionSize(string));
        
    }
    
}
