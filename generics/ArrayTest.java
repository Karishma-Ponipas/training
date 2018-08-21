package com.navis.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String args[]){
        int[] ranks=new int[5];
        ranks[0]=3;
        ranks[1]=2;
        ranks[2]=1;
        ranks[3]=4;
        ranks[4]=5;
        Arrays.sort(ranks);
        System.out.println(Arrays.binarySearch(ranks,3));
        
    }
}
