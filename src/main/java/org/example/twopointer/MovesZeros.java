package org.example.twopointer;

public class MovesZeros {
    public  static  void ZerosMoves(int [] arr){
        int lasnonZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int tem=arr[i];
                arr[i]=arr[lasnonZero];
               arr[lasnonZero]=tem;
               lasnonZero++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,0,3,12};
        ZerosMoves(arr);
    }
}
