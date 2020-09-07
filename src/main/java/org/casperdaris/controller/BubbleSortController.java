package org.casperdaris.controller;

import java.util.Arrays;

public class BubbleSortController {

    public static int[] intArray = new int[] {4, 32, 534, 21, 5, 12, 1, 43, 63, 643, 322, 23, 41, 739, 301, 4321, 74, 2};

    public static void Sorteer(int[] array) {

        // Deze Integer is de laatste ongesorteerde Int in de Array
        int lastUnsorted = array.length - 1;

        // Deze for loop zorgt ervoor dat de Integers vergeleken blijven worden totdat de lastUnsorted Integer is bereikt
        for (int i = 0; i < lastUnsorted; i++) {

            // Vergelijken welke Integer de grootste waarde heeft
            if (array[i] > array[i + 1]) {

                // Wanneer Integer i groter is dan de volgende Integer, dan omwisselen van plaats
                Wissel(array, i, i + 1);
            }
        }

        // Zodra de for loop is afgelopen, de laatste ongesorteerde Int veranderen
        lastUnsorted--;

        System.out.println(Arrays.toString(intArray));
    }

    // Deze functie verwisseld simpelweg twee Integers in een Array
    public static void Wissel(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
