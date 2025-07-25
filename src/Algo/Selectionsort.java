package Algo;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[]= {1 ,0 , 67, -9};
     selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last= arr.length-i-1;
            int maxindex = getmax(arr,0,last);
            int temp= arr[maxindex];
             arr[maxindex]=arr[last];
             arr[last]=temp;
        }
    }

    static int getmax(int [] arr, int start, int end){
        int max= start;
        for (int i = start; i <=end ; i++) {
           if(arr[max]<arr[i]){
               max=i;
           }
        }
        return max;
    }
}
