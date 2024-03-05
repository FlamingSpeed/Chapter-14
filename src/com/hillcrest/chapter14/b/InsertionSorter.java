package com.hillcrest.chapter14.b;

public class InsertionSorter {
    public static void sort(int[] values){
        for(int i = 1; i< values.length; i++){
            int next = values[i];
            int j = i;
            while (j > 0 && values[j-1] > next){
                values[j] = values[j-1];
                j--;
            }
            values[j] = next;
        }
    }
}
