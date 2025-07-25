package Algo;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
       // System.out.println(permute("","abc",ans));
        System.out.println(permuteList("","RRDD"));
    }

    //taking the ans list in the function body
    static ArrayList<String> permuteList(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            ArrayList<String> list1= permuteList(p.substring(0,i)+ch+p.substring(i),up.substring(1));
              ans.addAll(list1);
        }
       return ans;
    }


    //taking the ans list in argument
    static ArrayList<String> permute(String p,String up,ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            permute(p.substring(0,i)+ch+p.substring(i),up.substring(1),list);
        }
        return list;
    }
}
