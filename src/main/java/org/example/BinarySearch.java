package org.example;

public class BinarySearch {
    public static boolean binary_search(int[] arr, int search_element) {

        int l_bound=0,u_bound=arr.length;
        while(l_bound < u_bound){
            int mid=(l_bound + u_bound) / 2;
            if(search_element > arr[mid]){
                l_bound = mid + 1;
            }
            else if(search_element < arr[mid]){
                u_bound = mid - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}