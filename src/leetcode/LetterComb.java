package leetcode;

import java.util.ArrayList;

public class LetterComb {
    public static void main(String[] args) {
        System.out.println(helper("23"));
    }

    static ArrayList<String> helper(String digits){

        return letterComb("",digits);
    }
    static ArrayList<String> letterComb(String p,String up){
        if(up.isEmpty()){
            if(p!=""){
                ArrayList<String> list=new ArrayList<>();
                list.add(p);
                return list;
            }

            else {
                ArrayList<String> list=new ArrayList<>();
                return list;
            }
        }
        int digit= (up.charAt(0)-48);
        int low;
        int hi;
        if(digit<7){
             low=(digit-2)*3;
             hi=(digit*2)+(digit-3);
        } else if (digit==7) {
            low=15;
            hi=19;
        } else if (digit==8) {
            low=19;
            hi=22;
        }
        else {
            low=22;
            hi=26;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = low; i < hi; i++) {
            char ch=(char)('a'+i);
           ArrayList<String> l2= letterComb(p+ch,up.substring(1));
           ans.addAll(l2);
        }
        return  ans;
    }
}
