package Algo;
import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        int n=13423;
        int sum=0;
        int target=-9;
        int[]arr={4,3,2,1};

      //  System.out.println(rev(n, sum));
      //  System.out.println(palind(102));
       // System.out.println(reclinear(arr,target,0));
        // System.out.println(recbubblesort(arr,0));
        // bubbleSort(arr, arr.length-1, 1);
       // System.out.println(Arrays.toString(arr));
        //selectionSort(arr,0,0,0);
        //System.out.println(Arrays.toString(arr));
        skip("bcacdhe",0,"");
    }

    // sum of digits os a number using recursion
    static int sum(int n){
    if(n==0){
        return 0;
    }
    int rem=n%10;
    return rem+sum(n/10);
    }

    // reversing a number using recursion
    static int rev(int n, int sum){
        if(n==0){
            return sum;
        }
        int rem= n%10;
        return rev(n/10,sum*10+rem);
    }
    // checking if a number is palindrome or not using recursion
    static boolean palind(int n){
        int reverse= rev(n,0);
        return reverse == n;
    }

    //linear search using recursion
    static  int reclinear(int[] arr,int target, int i){
        if(arr[i]==target){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return reclinear(arr,target,i+1);
    }

    //checking whether an array is sorted or not using bubble sort
    static boolean recbubblesort(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<arr[i+1])&& recbubblesort(arr,i+1);
    }

    //bubble sorting using recursion
    static void bubbleSort(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j <= i) {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                bubbleSort(arr, i, j + 1);
            } else {
                bubbleSort(arr, i, j + 1);
            }
        }
        else {
            bubbleSort(arr, i - 1, 1);
        }
    }

    // selection sorting using recursion
    static void selectionSort(int[] arr, int i, int j, int max){
        if (i==arr.length-1){
            return;
        }
        if(j<arr.length-i){
            if (arr[j]>arr[max]){
                selectionSort(arr,i,j+1,j);
            }
            else {
                selectionSort(arr,i,j+1,max);
            }
        }
        else {
            int temp= arr[max];
            arr[max]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            selectionSort(arr,i+1,0,0);
        }
    }

    //skipping a character in a string
    static void skip(String s, int i, String ans){
        if (i==s.length()){
            System.out.println(ans);
            return;
        }
        else {
            if (s.charAt(i)=='a'){
                skip(s,i+1,ans);
            }
            else {
                skip(s,i+1,ans+s.charAt(i));
            }
        }
    }
}
