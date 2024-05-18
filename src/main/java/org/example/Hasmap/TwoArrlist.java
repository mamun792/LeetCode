package org.example.Hasmap;

import java.util.*;

public class TwoArrlist {
    public  static  void Arraytwo(int[] n1, int[]n2){
        Set<Integer> set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int num1: n1){
            set1.add(num1);
        }
        for(int num2: n2){
            set2.add(num2);
        }
        ArrayList<Integer> number1=new ArrayList<>(set1);
        number1.removeAll(set2);

        ArrayList<Integer> number2=new ArrayList<>(set2);
        number2.removeAll(set1);

        List<List<Integer>> result=new ArrayList<>();
        result.add(number1);
        result.add(number2);
        System.out.println(result);
    }
    public static void main(String[] args) {
        int [] num1= {1,2,3};
      int [] num2={2,4,6};

      Arraytwo(num1,num2);
    }
}
