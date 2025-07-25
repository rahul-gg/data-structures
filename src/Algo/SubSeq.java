package Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
      // System.out.println(subseq("a","def",ans));
        System.out.println(subseqList("","abc"));

    }

    static ArrayList<String> subseq(String p, String up, ArrayList<String> ans){
        if(up.isEmpty()){
                ans.add(p);
                return ans;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1),ans);
        subseq(p,up.substring(1),ans);
        return ans;
    }


    static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left=subseqList(p+ch,up.substring(1));
        ArrayList<String> right=subseqList(p,up.substring(1));
        right.addAll(left);
        return right;
    }
}
