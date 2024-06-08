package LeetcodePractice;
import java.util.*;
public class ExcelSheetTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c= (char)('A'+columnNumber%26);
            result.insert(0,c);
            columnNumber/=26;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Excel sheet title");
        int Number=sc.nextInt();
        System.out.println("The corresponding title is- "+convertToTitle(Number));

        
    }
}
