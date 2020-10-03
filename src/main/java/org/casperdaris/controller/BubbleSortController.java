package org.casperdaris.controller;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortController {

    public static ArrayList<Integer> intLijst = new ArrayList<Integer>();

    public static void Sorteer(ArrayList<Integer> list) {

        // Deze for loop zorgt ervoor dat de Integers vergeleken blijven worden totdat alle Integers vergeleken zijn
        for (int i = 0; i < list.size() - 1; i++) {

            // Vergelijken welke Integer de grootste waarde heeft
            if (list.get(i) > list.get(i + 1)) {

                // Wanneer Integer i groter is dan de volgende Integer, dan omwisselen van plaats
                Wissel(list, i, i + 1);
            }
        }

        System.out.println(Arrays.toString(intLijst.toArray()));
    }

    public static void SorteerAlles(ArrayList<Integer> list) {
        boolean gesorteerd = false;
        while(!gesorteerd) {
            gesorteerd = true;
            for (int i = 0; i <list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    Wissel(list, i, i + 1);
                    gesorteerd = false;
                    System.out.println(Arrays.toString(intLijst.toArray()));
                }
            }
        }
    }

    // Deze functie verwisseld simpelweg twee Integers in een Array
    public static void Wissel(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(j, temp);
    }

}
