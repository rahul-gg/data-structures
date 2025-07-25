package leetcode;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct= arr[i]-1;
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                swap(arr,i,correct);
            }
        }
        for (int j = 0; j <= arr.length-1; j++) {
            if(j!=arr[j]-1){
                return arr[j];
            }
        }
        return -1;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
