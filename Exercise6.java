import java.util.Scanner;
/*
    Napisz program kalkulator, który wykonuje wybraną przez użytkownika operacją arytmetyczną na dwóch wczytanych
     liczbach. Program powinien wczytywać dane ze standardowego wejścia i wypisywać wynik na standardowym wyjściu.
    Program powinien zakończyć się, gdy zamiast znaku operacji użytkownik wpisze znak 'q'.
 */

public class Exercise6 {

    public static void main(String[] args) {

        String addition = "+";
        String subtraction = "-";
        String multiplication = "*";
        String division = "/";
        String end = "q";


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1:");
        int number1 = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int number2 = in.nextInt();
        System.out.println("Podaj operator arytmetyczny '+', '-', '*', '/', 'q konczy program' :");
        String operator = in.next();

        if (operator.equals(addition)) {

            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

        }else if (operator.equals(subtraction)){

            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));

        }else if (operator.equals(multiplication)){

            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

        }else if (operator.equals(division)){

            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

        }else if (operator.equals(end)){
            System.out.println("Koniec programu. Bye");

        }

    }
}
