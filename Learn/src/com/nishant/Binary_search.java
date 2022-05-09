package com.nishant;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        System.out.println(binary_search(arr, 8));
    }

    static int binary_search(int[] arr, int target){
        int start = 0; //start pointer
        int end = arr.length - 1; //end pointer

        while(start <= end){
            int mid = start + (end - start)/2; //mid pointer

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1; //return -1 if the target is not in the array!!
    }

}
