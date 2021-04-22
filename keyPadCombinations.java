package Arraylist;
import java.util.*;
import java.lang.*;

public class keyPadCombinations {
    static String []arr = new String[]{".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  input = sc.next();
        System.out.println(getKPC(input));


    }
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==1){
            ArrayList<String> temp1 = new ArrayList<>();
            //System.out.println(str);
            int idx = str.charAt(0) - '0';
            //System.out.println(idx);
            String key = arr[idx];
            for(int i = 0; i < key.length();i++){
                temp1.add(String.valueOf(key.charAt(i)));
            }
            //System.out.println(temp1);
            return  temp1;
        }
        char ch = str.charAt(0);
        //System.out.println(ch);
        ArrayList<String> temp = getKPC(str.substring(1));
        int index = ch - '0';
        String keypad = arr[index];
        ArrayList<String> output = new ArrayList<>();
        int size = temp.size();
        for(int i = 0; i < keypad.length() ;i++) {
            String  ini = String.valueOf(keypad.charAt(i));
            for (int j = 0; j < size; j++) {
                output.add(ini + temp.get(j));
            }
        }
        return output;
    }
}
