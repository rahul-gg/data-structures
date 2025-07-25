package leetcode;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2};
//        sortColors(arr);
//        moveZeroesToEnd(arr);
//        System.out.println(digitCount(arr));
        int ans= longestSubstring("abcabcbbabcde");
        System.out.println(ans);
    }

    static void moveZeroesToEnd(int[] arr) {
        int i = 0;
        int zeroIndex = arr.length - 1;
        while (i < arr.length) {
            if (i >= zeroIndex) {
                return;
            }
            if (arr[i] != 0) {
                i++;
            } else {
                if (arr[zeroIndex] == 0) {
                    zeroIndex--;
                } else {
                    int temp = arr[zeroIndex];
                    arr[zeroIndex] = arr[i];
                    arr[i] = temp;
                    zeroIndex--;
                    i++;
                }
            }
        }
    }

    static void sortColors(int[] arr) {
        int ans = 0;
        int i = 0;
        int temp;
        while (i < arr.length) {
            if (arr[i] == 0) {
                temp = arr[ans];
                arr[ans] = arr[i];
                arr[i] = temp;
                i++;
                ans++;
            } else {
                i++;
            }
        }
        i = 0;
        while (i < arr.length) {
            if (arr[i] == 1) {
                temp = arr[ans];
                arr[ans] = arr[i];
                arr[i] = temp;
                i++;
                ans++;
            } else {
                i++;
            }
        }
        i = 0;
        while (i < arr.length) {
            if (arr[i] == 2) {
                temp = arr[ans];
                arr[ans] = arr[i];
                arr[i] = temp;
                i++;
                ans++;
            } else {
                i++;
            }
        }
    }

    static boolean digitCount(int[] arr) {
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;
        while (i < arr.length) {
            int value = arr[i];
            count[value] = count[value] + 1;
            i++;
        }
        int j = 0;
        while (j < arr.length) {
            if (count[j] != arr[j]) {
                return false;
            }
            j++;
        }
        return true;
    }

    static int longestSubstring(String s){
        int max=1;
        int count=0;
        String str = "";
//        System.out.println(s.substring());
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i,i+1);
            if(str.contains(ch)==true){
              if(count>max){
                  max=count;
              }
                count=1;
                str="";
            }
            else{
                str=str+ch;
                count++;
            }
        }

        return max;
    }

}
