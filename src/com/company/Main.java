package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,6,4,2,8,0,7};
    GTLN(arr);
    }
    static void GTLN(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("số lớn nhất trong mảng là: "+max);
    }


}
