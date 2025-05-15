package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        int[] sortIntegers = getDescendArray(new int[]{7,30,35});
        System.out.println(Arrays.toString(sortIntegers));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] randArray = new int[len];
        for(int i = 0; i < randArray.length; i++) {
            randArray[i] =random.nextInt(len,50);
        }

        return randArray;
    }

    public static int[] getDescendArray(int[] array) {
        System.out.println();
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag =false;
            for(int i = 0; i < sortedArray.length-1;i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("--------> "+Arrays.toString(sortedArray));
                }
            }
            System.out.println("---> "+Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
