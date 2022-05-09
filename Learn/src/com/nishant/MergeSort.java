package com.nishant;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergesort(new int[]{100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90})));
    }//-

    static int[] mergesort(int[] arr){

        //base case
        if(arr.length <= 1) return arr;

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] arr_1, int[] arr_2) {

        int[] new_array = new int[arr_1.length + arr_2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr_1.length && j < arr_2.length){
            if(arr_1[i] < arr_2[j]){
                new_array[k] = arr_1[i];
                i++;
                k++;
            }else{
                new_array[k] = arr_2[j];
                j++;
                k++;
            }
        }

        while(i < arr_1.length){
            new_array[k] = arr_1[i];
            i++;
            k++;
        }
        while (j < arr_2.length){
            new_array[k] = arr_2[j];
            j++;
            k++;
        }

        return new_array;

    }

}
