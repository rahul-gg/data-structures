package leetcode;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={4};
        int target=0;
        System.out.println(pivotsearch(arr));
    }
    static int search(int[] arr,int target){
        int pivot= pivotsearch(arr);
        int ans1= binarysearch(arr,0,pivot,target);
        if(ans1>=0){
            return ans1;
        }
        else{
            int ans2= binarysearch(arr,(pivot+1),arr.length-1,target);
            return ans2;
        }
    }
    static int pivotsearch(int[] arr) {
        int start= 0;
        int end= arr.length-1;
        if(arr[start]<arr[end]){
            return end;
        }
        while ( start< end) {
            int mid =start+ ((end-start)/2);
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
            else if(arr[mid]>arr[start]) {
                start = mid ;
            }

        }
      return start;
        }



    static int binarysearch (int[] arr,int start ,int end, int element){
        while ( start<= end) {
            int mid = (start+ ((end-start)/2));
            if (arr[mid] > element) {
                end = mid - 1;
            } else if (arr[mid] < element) {
                start = mid+1;
            }
            if (arr[mid] == element) {
                return mid;
            }
        }
        return -1;
    }

}
