package LeetcodePractice;
import java.util.*;
public class BitDidderence {
    public static int flipNeed(int a, int b){
        int flip=0;
        String binaryA=convertIntTOBinary(a);
        String binaryB=convertIntTOBinary(b);
        StringBuilder sb=new StringBuilder();
        int lenA=binaryA.length();
        int lenB=binaryB.length();
        if(lenA!=lenB){
            int n=lenB-lenA;
            String zero="0";
            for(int i=0;i<n;i++){
                sb.append(zero);
            }
        }
        String newStringA=sb+binaryA;
        for(int i=newStringA.length()-1;i>=0;i--){
            if(binaryB.charAt(i)!=newStringA.charAt(i)){
                flip++;
            }
        }
        return flip;
    }

    public static String convertIntTOBinary(int number){
        String binaryNumber=Integer.toBinaryString(number);
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number A");
        int numberA=sc.nextInt();
        System.out.println("Enter the Number B");
        int numberB=sc.nextInt();
        System.out.println("A needs "+flipNeed(numberA, numberB)+" number of flips to become B");

    }
}
