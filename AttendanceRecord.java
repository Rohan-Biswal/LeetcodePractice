package LeetcodePractice;
import java.util.*;
public class AttendanceRecord {
    public static boolean checkRecord(String s) {
        if(s.contains("LLL")) return false;
        int absentCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') absentCount++;
        }
        if(absentCount>1) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string of Student attendance record");
        String string= sc.nextLine();
        System.out.println("The attendance record shows that he/she is "+checkRecord(string)+" for attendance award");
    }
}
