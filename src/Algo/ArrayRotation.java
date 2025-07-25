package Algo;
// https://leetcode.com/problems/rotate-array/

//  Reverse 0 to k-1
//  Reverse k-1 to end
//  Reverse 0 to k+1
// Reverse k+2 to end
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
int[] arr={-1,-100,3,99};
    // System.out.println(Arrays.toString(rotate(arr,2)));
       rotateInPlace(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    static int [] rotate(int[] arr,int k){
        int [] newArr= new int[arr.length];
        int i= arr.length-k;
        int j=0;
        while (i< arr.length){
            newArr[j]=arr[i];
            j++;
            i++;
        }

        i=0;

        while (i< arr.length-k){
            newArr[j]=arr[i];
            j++;
            i++;
        }
        return newArr;
    }

    static void rotateInPlace(int[] arr,int k){
        k=k%arr.length;

        reverse(arr, 0,arr.length-1);
        reverse(arr,0, k-1);
        reverse(arr,k,arr.length-1);
    }

    static void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
