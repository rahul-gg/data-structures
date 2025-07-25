package leetcode;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
    int[] arr= {1,2,3,4,5,1,0};
    int element=2;
        System.out.println(search(arr,element));
    }
    static int search(int[] arr,int target) {
        int peak = peakindexinmountainarray(arr);
        int firstTry = orderagnosticbinarySearch(arr, 0 ,peak , target);
        if (firstTry != -1) {
            return firstTry;
        }
        else {
            return orderagnosticbinarySearch(arr, peak+1, arr.length - 1, target);
        }
    }

    static int peakindexinmountainarray (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start+ ((end-start)/2);
            if (arr[mid] > arr[mid+1]) {
                end = mid ;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderagnosticbinarySearch (int[] arr,int low,int high, int element) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low]<=arr[high]) {
                if (arr[mid] > element) {
                    high = mid-1;
                } else if (arr[mid] < element) {
                    low = mid+1;
                }
                if (arr[mid] == element) {
                    return mid;
                }
            }
            else{
                if (arr[mid] > element) {
                    low = mid +1;
                } else if (arr[mid] < element) {
                    high = mid - 1;
                }
                if (arr[mid] == element) {
                    return mid;
                }
            }
        }
        return -1;
    }
}

