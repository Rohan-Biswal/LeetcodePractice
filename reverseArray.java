package LeetcodePractice;

public class reverseArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int n = array.length;
        int i=0;
        int j=n-1;
        System.out.println("orignal array");
        for(int a=0;a<n;a++){
            System.out.print(array[a]+" ");
        }
        System.out.println();

        while(i<j){
            int temp= array[i];
            array[i]= array[j];
            array[j]= temp;
            i++;
            j--;
        }

        System.out.println("reversed array");
        for(int a=0;a<n;a++){
            System.out.print(array[a]+" ");
        }
    }
}
