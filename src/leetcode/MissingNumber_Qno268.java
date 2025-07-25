package leetcode;

public class MissingNumber_Qno268 {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int n=3;
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        cyclicsort(arr);
        for (int i = 0; i <= arr.length-1; i++) {
            if(i!=arr[i]){
                return i;
            }
        }
        return arr.length;
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct= arr[i];
            //ignoring values to solve index out of bounds
            if(correct== arr.length){
                i++;
                continue;
            }
            //duplicates are ignored as well w this condition
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                swap(arr,i,correct);
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
