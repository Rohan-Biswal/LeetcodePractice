package LeetcodePractice;

import java.util.*;

public class UncommonWord {

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        int l1=arr1.length;
        int l2=arr2.length;
        HashMap<String,Integer> h1=new HashMap<String,Integer>();
        HashMap<String,Integer> h2= new HashMap<String,Integer>();
        for(int i=0;i<l1;i++){
            h1.put(arr1[i],h1.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<l2;i++){
            h2.put(arr2[i],h2.getOrDefault(arr2[i],0)+1);
        }

        HashSet<String>hp=new HashSet<String>();
        for(var a:h1.keySet()){
            if(h1.get(a)==1){
                if(!h2.containsKey(a)) hp.add(a);
            }
        }
        for(var a:h2.keySet()){
            if(h2.get(a)==1){
                if(!h1.containsKey(a)) hp.add(a);
            }
        }
        String[] ans=new String[hp.size()];
        int index=0;
        for(var a:hp) ans[index++]=a;
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Line");
        String firstLine=sc.nextLine();
        System.out.println("Enter the second line");
        String secondLine=sc.nextLine();
        String[] result=uncommonFromSentences(firstLine, secondLine);
        System.out.println("The word which is different in both lines are-");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
