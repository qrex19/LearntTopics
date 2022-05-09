package com.nishant;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println(linearsearch(arr, 1234));
    }

    static int linearsearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }

}
