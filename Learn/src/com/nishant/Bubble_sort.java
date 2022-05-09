package com.nishant;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 0,2};

        bubble_sort(arr);

        System.out.println(Arrays.toString(arr));
    }//-

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble_sort(int[] arr){
        //algo

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length  - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

}
