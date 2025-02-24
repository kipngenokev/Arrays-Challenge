package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(10);
        System.out.print("Unsorted array :"+ Arrays.toString(unsortedArray));
    }

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] myRandomizedArray = new int[length];
//        for (int i = 0 ; i < length; i++) {
//            System.out.print(random.nextInt(100)+ " ");
//        }

        for (int i = 0; i < length; i++) {
            myRandomizedArray[i] = random.nextInt(100);
        }

        return myRandomizedArray;
    }
}