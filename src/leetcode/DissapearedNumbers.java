package leetcode;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
import java.util.ArrayList;
import java.util.List;
public class DissapearedNumbers {
    public static void main(String[] args) {
     int[] arr={1,1};
     cyclicsort(arr);
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list= new ArrayList<>(10);
        cyclicsort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr[i]-1){
                list.add(i+1);
            }
        }
        return list;
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct= arr[i]-1;
//            if(arr[i]==arr[correct]){
//                i++;
//                continue;
//            }
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                swap(arr,i,correct);
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
