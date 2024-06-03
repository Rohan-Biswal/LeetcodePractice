package LeetcodePractice;

public class twoSumProblem {
    public static int[] twoSumProb(int array[],int target){
        if(array.length==0){
            System.out.println("Array is empty");
            System.exit(-145);
        }
        else{
            for(int i=0;i<array.length-1;i++){
                for(int j=1;j<array.length;j++){
                    if(array[i]+array[j]==target){
                        return new int[] {i,j};
                    }

                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] array ={};
        int target=14;
        int [] result=twoSumProb(array,target);
        System.out.println("The target is found at index "+result[0]+" and "+result[1]);
    }
}
