package org.example.Hasmap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public  static  boolean hasUniqueOccurrences(int[] n){
        HashMap<Integer ,Integer> number=new HashMap<>();
        for(int num:n){
            number.put(num, number.getOrDefault(num,0)+1);
        }
        HashSet<Integer> unique=new HashSet<>();
        for(int nuq: number.values()){
            if(!unique.add(nuq)){
                return  false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int []num={1, 2, 2, 1, 1, 3};
        hasUniqueOccurrences(num);
    }
}
