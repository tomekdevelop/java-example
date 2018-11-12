
/*Napisz program, który poda rozwiązania równania kwadratowego. Równanie powinno mieć postać ax^2 + bx + c = 0.
W zależności od podanych współczynników a, b i c program powinien wyświetlić wszystkie rozwiązania (2, 1, lub informacje
o braku rozwiązań rzeczywistych).*/

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        System.out.println("Podaj a :");
        double numberA = readNumber();
        System.out.println("Podaj b :");
        double numberB = readNumber();
        System.out.println("Podaj c :");
        double numberC = readNumber();


        double[] result = squareEquation(numberA, numberB, numberC);
        readTable(result);


    }


    public static double[] squareEquation(double a, double b, double c) {
        double[] tableSquare = new double[2];
        double[] tableXzero = new double[1];

        double delta = b * b - 4 * a * c;

        if (delta == 0) {
            double xZero = -b / 2 * a;
            System.out.println("Delta = 0");
            System.out.print("x zero = ");

            return tableXzero;

        } else if (delta > 0) {
            System.out.println("Delta wieksza od 0");
            double pierwiastekDelta = Math.sqrt(delta);
            double xOne = (-b - pierwiastekDelta) / 2 * a;
            double xTwo = (-b + pierwiastekDelta) / 2 * a;


            tableSquare[0] = xOne;
            tableSquare[1] = xTwo;

            return tableSquare;
        }else {
            System.out.println("Delta mniejsza od 0");
        }


        return tableSquare;

    }

    public static void readTable(double[] table){

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }

    }

    public static double readNumber() {
        Scanner scanner = new Scanner((System.in));
        double number = scanner.nextDouble();

        return number;
    }
}
