package Arraylist;
import  java.util.*;

public class getSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 1){//if last letter then only add it in arraylist and return the list
            ArrayList<String> tempArray = new ArrayList<>();
            tempArray.add("");
            tempArray.add(str);
            return  tempArray;
        }
        char ch = str.charAt(0); // remove the first character and call gss on the rest of the string
        ArrayList<String> temp1 = gss(str.substring(1));
        //System.out.println(temp1);
        int size = temp1.size();
        for(int i = 0 ; i < size; i++){//adding the character and empty string to the elements of the arraylist
            String temp = temp1.get(i);//to generate subsequence
            temp1.set(i, ""+temp);
            temp1.add(ch + temp);
        }
//        for(int i = 0 ; i < temp1.size(); i++){
//            temp1.set(i ,ch +temp1.get(i));
//        }
        return  temp1;
    }
}
