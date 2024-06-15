package LeetcodePractice;

import java.net.Socket;
import java.util.Scanner;

public class RobertReturnToOrign {

    public static boolean judgeCircle(String moves) {
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        for(char c : moves.toCharArray()){
            switch(c){
                case 'U':up++; break;
                case 'D':down++; break;
                case 'L':left++; break;
                case 'R':right++; break;
            }
        }
        return left==right && down==up;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Word=sc.nextLine();
        System.out.println("The given string is "+judgeCircle(Word)+" for robert problem");
    }
}
