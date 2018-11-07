import java.util.Scanner;
/*
    5. Napisz program, który wczytuje ze standardowego wejścia nieujemną liczbę całkowitą n i wypisuje na standardowym
    wyjściu sumę kwadratów liczb od 0 do n, czyli wartość 0^2 + 1^2 + 3^2 + ... + n^2.
 */

public class Exercise5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int Number = in.nextInt();

        int firstNumber = 0;
        int result = 0;

        if (Number < 0) {
            System.out.println("Podana liczba jest ujemna! :( ");
        } else {
            firstNumber = Number;
        }


        for (int i = 1; i <= firstNumber; i++) {

            result += i * i;
        }

        System.out.println("Dla n rownego: " + firstNumber + " suma kwadratow wynosi: " + result);
    }


}

