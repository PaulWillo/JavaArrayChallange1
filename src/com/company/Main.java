package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readIntegers(5);
    }

    public static int[] readIntegers(int count) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) { //should change this to a while loop but im lazy boi
            System.out.println("Please enter a number, you have " + count-- + " left to input");
            numbers[i] = input.nextInt();
        }
        return findMin(numbers);
    }

    public static int[] findMin(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("The minimum value is " + min);
        return array;
    }

}


