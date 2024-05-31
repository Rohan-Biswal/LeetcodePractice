package LeetcodePractice;

public class swapNumbers {

    static int [] swapTwoNumbers(int firstNumber, int secondNumber){
        firstNumber=firstNumber+secondNumber;
        secondNumber=firstNumber-secondNumber;
        firstNumber=firstNumber-secondNumber;
        int swapedArray[]={firstNumber,secondNumber};
        return swapedArray;
        

    }
    public static void main(String[] args) {
        int firstNumber= 3;
        int secondNumber=2;
        System.out.println("value after before first number is- "+firstNumber+" second number is- "+secondNumber);
        int swapedArray[]=swapTwoNumbers(firstNumber,secondNumber); 
        System.out.println("value after swapping first number is- "+swapedArray[0]+" second number is- "+swapedArray[1]);

    }
}
