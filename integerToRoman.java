package LeetcodePractice;
import java.util.*;

public class integerToRoman {

    public static String intToRoman(int num) {
        String[] romanNotation ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] integerValue ={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder romanValue = new StringBuilder();
        // this loop will check if the num is greater or equals to the values in integerValue array.
        // if it is present it will append the respected roman letter from romanNotaion array.
        for(int i=0;i<integerValue.length;i++){
            while(num>=integerValue[i]){
                romanValue.append(romanNotation[i]);
                num-=integerValue[i]; //after appending the value it will subtract the value from nums 
            }
        }
        return romanValue.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numner you want to conver int Roman Number");
        int number = sc.nextInt();
        System.out.println("The vlaue of this number in Roman is-"+intToRoman(number));
    }
    
}
