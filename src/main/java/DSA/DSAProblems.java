package DSA;

import java.util.*;

/**
 *input  [2,5,1,3,4,7]
 * n = 3
 *OutPut [2,3,5,4,1,7]
 */
public class DSAProblems {
    public static void main(String[] args) {
        HashMap<Integer,String > hm = new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");
        hm.put(4,"D");
        Set<Map.Entry<Integer,String>> s = hm.entrySet();
        for(Map.Entry<Integer,String> k : s){
            System.out.println("Keys: "+k.getKey() + "\nValues: "+k.getValue()+"\n");
        }
    }
}
