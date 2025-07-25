package Algo;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        System.out.println(recursiveBinarySearch(arr,5,0,arr.length-1));
    }
    static int binarysearch(int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start+ ((end-start)/2);
                if (arr[mid] > element) {
                    end = mid - 1;
                } else if (arr[mid] < element) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
        }
        return -1;
    }
    //recursive approach
    static int recursiveBinarySearch(int[] arr, int element, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+ ((end-start)/2);
        if (arr[mid] > element) {
            end = mid - 1;
        } else if (arr[mid] < element) {
            start = mid + 1;
        }
        else {
            return mid;
        }
        return recursiveBinarySearch(arr,element,start,end);
    }
}
