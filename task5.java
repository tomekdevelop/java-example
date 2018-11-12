/*Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej
        liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe
        (https://pl.wikipedia.org/wiki/Sortowanie_bąbelkowe).
 */

import java.util.Scanner;

public class task5 {


    public static void main(String[] args) {

        int[] table = {9, 6, 4, 3};

        int[] resultTable = bubbleSort(table);

        for (int i = 0; i < resultTable.length; i++) {

            System.out.print(resultTable[i]);
            System.out.print(", ");
        }
    }


    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }


}
