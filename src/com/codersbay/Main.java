package com.codersbay;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random fortuna = new Random();
        int arraySizeRandom = fortuna.nextInt(20) + 2; // +2 because random can also return 0
        int[] arrayRandom = new int[arraySizeRandom];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = fortuna.nextInt(100);
        }
        //TEST
        //int[] arrayRandom = {22, 0, 1, 39, 99, 51, 83, 7, 85, 55};

        System.out.println("Random Array: ");
        System.out.println(Arrays.toString(arrayRandom));

        insertionSort(arrayRandom);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arrayRandom));
    }

    public static void insertionSort(int[] inputArray) {
        if (inputArray.length <= 1) {
            return;
        }

        for (int i = 0; i < inputArray.length - 1; i++) {
            int helpElement = inputArray[i];
            int helpIdx = i;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[j] < helpElement) {
                    helpElement = inputArray[j];
                    helpIdx = j;
                }
            }
            inputArray[helpIdx] = inputArray[i];
            inputArray[i] = helpElement;
        }
        return;
    }
}