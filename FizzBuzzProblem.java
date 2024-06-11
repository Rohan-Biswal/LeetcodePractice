package LeetcodePractice;
import java.util.*;
public class FizzBuzzProblem {

    public static List<String> fizzBuzz(int n) {
        List<String> Li= new ArrayList();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                Li.add("Fizz");
            }
            else if(i%5==0 && i%3!=0){
                Li.add("Buzz");
            }
            else if(i%3==0 && i%5==0){
                Li.add("FizzBuzz");
            }
            else{
                Li.add(String.valueOf(i));
            }
        }
        return Li;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int Number=sc.nextInt();
        System.out.println("The result after that is- "+fizzBuzz(Number));

        
    }
    
}