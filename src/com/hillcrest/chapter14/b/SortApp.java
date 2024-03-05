package com.hillcrest.chapter14.b;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        var values = ArrayUtil.randomArray(10000,100000);
        System.out.println(Arrays.toString(values));
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        QuickSorter.sort(values);
        stopWatch.stop();
        System.out.println(Arrays.toString(values));
        System.out.printf("Time to sort %d", stopWatch.getElapsedTime());
        stopWatch.reset();
    }
}
