package leetcode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
     int [] arr= {1};
     System.out.println(peakindexinmountainarray(arr));
    }
    static int peakindex(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low+ ((high-low)/2);
            if(mid==0){
                return 1;
            }
            if (arr[mid] > arr[mid-1]) {
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }
                else{
                    low= mid+1;
                }
            } else if (arr[mid] > arr[mid+1]) {
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //Alternate and Better solution
    static int peakindexinmountainarray(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while (low <high) {
            int mid = low+ ((high-low)/2);
            if (arr[mid] > arr[mid+1]) {
                high = mid ;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
