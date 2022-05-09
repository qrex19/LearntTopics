package com.nishant;

import java.util.Arrays;

public class Selection_sort {

    public static void main(String[] args) {

        int[] arr = {10, 67, 45, 21, 90, 54, 21, 32, 5};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));


    }//-

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }//-

    static int smallestindexnarr(int[] arr, int index){

        int innum = arr[index];
        int n = index;

        for (int i = index; i < arr.length; i++) {
            if(arr[i] < innum){
                innum = arr[i];
                n = i;
            }
        }

        return n;

    }//-

    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, smallestindexnarr(arr, i));
        }
    }
}
