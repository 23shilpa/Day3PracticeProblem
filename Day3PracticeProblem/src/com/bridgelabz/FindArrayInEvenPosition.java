package com.bridgelabz;
//Java Program to print the elements of an array present on an even position
public class FindArrayInEvenPosition {
    public static void main(String[] args) {


        int [] arr = new int [] {1, 2, 3, 4, 5};

        System.out.println("Elements of given array present on even position: ");

        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
//odd position
// public static void main(String[] args) {
//
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//        System.out.println("Elements of given array present on odd position: ");
//
//        for (int i = 0; i < arr.length; i = i+2) {
//            System.out.println(arr[i]);
//        }
//    }
//}