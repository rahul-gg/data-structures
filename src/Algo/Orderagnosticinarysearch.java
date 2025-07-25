package Algo;
import java.lang.*;


public class Orderagnosticinarysearch {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(orderagnosticbinarySearch(arr, 3));
    }

    static int orderagnosticbinarySearch(int[] arr, int element) {
                    int low = 0;
                    int high = arr.length - 1;
                    while (low <= high) {
                        int mid = (low + high) / 2;
                        if(arr[low]<=arr[high]) {
                            if (arr[mid] > element) {
                                high = mid - 1;
                            } else if (arr[mid] < element) {
                                low = mid + 1;
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
