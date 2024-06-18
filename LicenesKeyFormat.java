package LeetcodePractice;
import java.util.*;

class LicenesKeyFormat{

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){

            char c=s.charAt(i);
            if(c=='-') continue;
            if(!Character.isDigit(c) && c>90) c-=32;
            if(count==k){
                sb.append('-');
                count=0;
            }
            sb.append(c);
            count++;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the License key that you want to formating");
        String lisenceKey=sc.nextLine();
        System.out.println("Enter the number you want that the have seperating by '-' ");
        int formatNumber=sc.nextInt();
        System.out.println("The string after formating is->"+licenseKeyFormatting(lisenceKey, formatNumber));
        
    }
}