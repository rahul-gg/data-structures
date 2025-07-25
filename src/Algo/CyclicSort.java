package Algo;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
     int[] arr={3,5,2,4,1};
     cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct= arr[i]-1;
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
