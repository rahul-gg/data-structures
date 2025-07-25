package leetcode;

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {
int[] arr={4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int start= 0;
        int end= arr.length-1;
        if(arr[start]<arr[end]){
            return arr[start];
        }
        while ( start< end) {
            int mid =start+ ((end-start)/2);
            if(arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            if(arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
            else if(arr[mid]>arr[start]) {
                start = mid ;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }


}
