/*
/ 3. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym
wyjściu największą z ich wartości (pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int firstNumber = readNumberFromConsole(1);
        int secoundNumber = readNumberFromConsole(2);
        int thirdNumber = readNumberFromConsole(3);

        int[] greatest = findGreatestNumbers(firstNumber, secoundNumber, thirdNumber);
        System.out.println(Arrays.toString(greatest));
    }

    static int[] findGreatestNumbers(int... numbers) {
        int resultCount = 0;

        int greatest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatest){
                greatest = numbers[i];
            }
        }

        int greatestCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == greatest){
                greatestCount++;
            }
        }

        int[] result = new int[greatestCount];
        for (int i = 0; i < greatestCount; i++) {
            result[i] = greatest;
        }
        return result;


    }



    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();

    }

}
