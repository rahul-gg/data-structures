package Algo;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
int[] arr={10,80,30,90,40,50,70};
quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low , int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e= hi;
        int m= s+(e-s)/2;
        int pivot= arr[hi];

        while (s<e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s<e){
                int temp= arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
            }
        }
        quickSort(arr,low,e-1);
        quickSort(arr,s+1,hi);
    }
}
