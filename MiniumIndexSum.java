package LeetcodePractice;
import java.util.*;
public class MiniumIndexSum {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> h= new HashMap<String,Integer>();
        for(int i=0;i<list1.length;i++){
            h.put(list1[i],i);
        }
        ArrayList<String> s= new ArrayList<String>();
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(h.containsKey(list2[i])){
                int tempSum=i+h.get(list2[i]);
                if(tempSum<sum){
                    sum=tempSum;
                }
            }
        }
        for(int i=0;i<list2.length;i++){
            if(h.containsKey(list2[i])){
                int tempSum=i+h.get(list2[i]);
                if(tempSum==sum){
                    s.add(list2[i]);
                }
            }
        }
        String[] ans=new String[s.size()];
        for(int i=0;i<s.size();i++){
            ans[i]=s.get(i);
        }
        return ans;
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of first array");
    int n1=sc.nextInt();
    String[] list1=new String[n1];
    System.out.println("enter the element of first array");
    for(int i=0;i<=n1;i++){
        list1[i]=sc.nextLine();
    }
    System.out.println("enter the size of scond array");
    int n2=sc.nextInt();
    System.out.println("enter the element of second array");
    String[] list2=new String[n2];
    for(int j=0;j<=n1;j++){
        list2[j]=sc.nextLine();
    }
    String[] result= findRestaurant(list1, list2);
    System.out.println("The string which are uncommon are:-");
    for(int j=0;j<n1;j++){
        System.out.print(result[j]);
    }
   } 
}
