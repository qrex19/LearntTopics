package com.nishant;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }//-

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }

}
