package LeetcodePractice;
import java.util.*;




public class code1 {
    static void printNumber(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("the number will be printing in decreasing order");
        printNumber(n);
        
    }
}

