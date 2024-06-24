package LeetcodePractice;
import java.util.*;
public class UniqueEmailAddress {
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
       int count=0;
   
       for( String email : emails){
            StringBuilder sb = new StringBuilder();
           int i=0;
           boolean isLocalName=true;
           while(i<email.length()){
               if(isLocalName){
                   if(email.charAt(i)=='+'){
                       while(i<email.length() && email.charAt(i)!='@'){
                           i++;
                       }
                   }
                   if(email.charAt(i)!='.'){
                       sb.append(email.charAt(i));
                   }
                   if(email.charAt(i)=='@'){
                       isLocalName=false;
                   }
               }else{
                   sb.append(email.charAt(i));
               }
               i++;
           }
            String e= sb.toString();
           if(!set.contains(e)){
               set.add(e);
               count++;
           }
       }
       return count;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n=sc.nextInt();
        String[] emails=new String[n];
        System.out.println("Enter the different emails");
        for(int i=0;i<emails.length;i++){
            emails[i]=sc.next();
        }
        System.out.println("the number of different email addresses that actually receive mails are-"+numUniqueEmails(emails));

        
    }
}
