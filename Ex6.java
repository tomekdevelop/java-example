/*
    6. Napisz program kalkulator, który wykonuje wybraną przez użytkownika operacją arytmetyczną na dwóch wczytanych
    liczbach. Program powinien wczytywać dane ze standardowego wejścia i wypisywać wynik na standardowym wyjściu.
    Program powinien zakończyć się, gdy zamiast znaku operacji użytkownik wpisze znak 'q'.

 */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        boolean end = true;
        String operatorArithmetic = readOperator();
        int firstNumber = readNumberFromConsole(1);
        int secoundNumber = readNumberFromConsole(2);




        calculate(firstNumber, secoundNumber, operatorArithmetic);


    }


    static void calculate(int numberOne, int numberTwo, String operator) {


        switch (operator) {
            case ("+"):
                System.out.println(numberOne + numberTwo);
                break;
            case ("-"):
                System.out.println(numberOne - numberTwo);
                break;
            case ("*"):
                System.out.println(numberOne * numberTwo);
                break;
            case ("/"):
                System.out.println(numberOne / numberTwo);
                break;
            default:
        }


    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();

    }

    static String readOperator() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Podaj operator arytmetyczny '+', '-', '*', '/', 'q konczy program' :");
        String operator = scanner.next();
        String end = "q";
        if(operator.equals(end)){
            System.exit(0);
        }
        return operator;
    }

    enum Operators {
        ADDITION, SUBTRACTION, MULTIPLITACION, DIVISION
    }
}
