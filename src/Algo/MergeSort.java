package Algo;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {8,3,4,12,5,6};
       // arr=mergeSort(arr);
       // System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // merge sorting using recursion
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;

        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] ans= new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;

        while (i< first.length && j< second.length){
            if(first[i]<second[j]){
                ans[k]=first[i];
                i++;
            }
            else{
                ans[k]=second[j];
                j++;
            }
            k++;
        }
        //it can be possible that one of the arrays has run out of elements
        // int that case copy the rest of the elements in the array that is left with us
        while(i< first.length){
            ans[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            ans[k]=second[j];
            j++;
            k++;
        }
        return ans;
    }

    static void mergeSortInPlace(int[] arr,int s, int e){
        if(e-s==1){
             return;
        }
        int mid= (s+e)/2;

        mergeSortInPlace(arr,0,mid);
        mergeSortInPlace(arr,mid,e);

         mergeInPlace(arr,s,e,mid);
    }

    private static int[] mergeInPlace(int[] arr, int s, int e, int m) {
        int[] ans= new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while (i<m && j< e){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        //it can be possible that one of the arrays has run out of elements
        // int that case copy the rest of the elements in the array that is left with us
        while(i< m){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            ans[k]=arr[j];
            j++;
            k++;
        }
        // copying the sorted array into the original array
        for (int l = 0; l < ans.length; l++) {
            arr[s+l]=ans[l];
        }
        return arr;
    }
}
