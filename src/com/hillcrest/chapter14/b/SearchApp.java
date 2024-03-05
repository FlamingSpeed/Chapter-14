package com.hillcrest.chapter14.b;

import java.util.Arrays;
import java.util.Scanner;

public class SearchApp {
    public static void main(String[] args) {
        var values = ArrayUtil.randomArray(20,100);
        MergeSorter.sort(values);
        System.out.println(Arrays.toString(values));
        var in = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        var value = in.nextInt();
        int position = BinarySearcher.search(values,value);
        if(position ==-1){
            System.out.printf("%d was not found", value);
        }else{
            System.out.printf("%d is in position %d", value, position);
        }
    }
}
