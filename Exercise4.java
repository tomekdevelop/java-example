import java.util.Scanner;

/*
4. Napisz program, który wczytuje ze standardowego wejścia nieujemną liczbę
całkowitą n i wypisuje na standardowym wyjściu element ciągu Fibonacciego o indeksie n.
 */

public class Exercise4 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int Number = in.nextInt();

        int firstNumber = 0;

        if (Number < 0) {
            System.out.println("Podana liczba jest ujemna! :( ");
        } else {
            firstNumber = Number;
        }

        int prev1 = 1;
        int prev2 = 1;


        if (firstNumber <= 2) {
            System.out.println("Fibonaci n " + firstNumber + " wynosi 1");
        }


        for (int i = 3; i <= firstNumber; i++) {

            int currentElement = prev1 + prev2;

            System.out.println("Fibonaci n " + i + " wynosi: " + currentElement);

            prev2 = prev1;
            prev1 = currentElement;


        }


    }


}

