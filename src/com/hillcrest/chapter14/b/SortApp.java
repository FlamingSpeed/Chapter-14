package com.hillcrest.chapter14.b;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        var values = ArrayUtil.randomArray(600000,10000);
        System.out.println(Arrays.toString(values));
        MergeSorter.sort(values);
        System.out.println(Arrays.toString(values));
    }
}
