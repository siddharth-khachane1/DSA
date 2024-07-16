package org.example;

import static org.example.BinarySearch.binary_search;
import static org.example.FibonacciRecursive.fibonacci_recursive;

public class Main {
    public static void main(String[] args) {
        System.out.println(binary_search(new int[]{1, 3, 5, 7, 9},5));
        System.out.println(fibonacci_recursive(3));
    }
}