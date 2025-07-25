package leetcode;
//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
int[] arr={7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct= arr[i]-1;
            if(correct>= arr.length || correct<0){
                i++;
                continue;
            }
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                swap(arr,i,correct);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
