package com.nishant;

import java.util.Arrays;

public class Cyclic_sort {

    public static void main(String[] args) {
        //code bitch

        int[] arr = {5, 1, 2, 3, 4};
        cyclic_sort(arr);

        System.out.println(Arrays.toString(arr));

    }//-

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclic_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                swap(arr, i, arr[i] - 1);
            }
        }
    }

}
