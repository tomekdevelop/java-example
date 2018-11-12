
//1. Napisz funkcję, która pobierze dwie liczby całkowite i zwróci ich iloczyn (wynik mnożenia)
//2. Napisz metodę main, która pobierze dwie liczby całkowite i wyświetli wynik ich mnożenia (użyj funkcji z 1)
//3. Przepisz funkcję z punktu 1 tak, aby NIE używać operatorów mnożenia i dzielenia (czyli * , /)
//4. Przetestuj funkcję z 3 z liczbami ujemnymi. Jeśli nie działa – popraw.

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        System.out.println("Podaj pierwsza liczbe: ");
        int numberOne = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int numberTwo = scanner.nextInt();

        //System.out.println(numberOne +" x " + numberTwo +" = "+multiplication(numberOne, numberTwo));

        System.out.println(numberOne + " x " + numberTwo + " = " + multplicationFor(numberOne, numberTwo));
    }

    public static int multplicationFor(int a, int b) {
        int result = 0;

        if (a > 0 && b < 0) {
            b = b * -1;
            a = a * -1;
        }

        if (a < 0 && b < 0) {
            b = b * -1;
            a = a * -1;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return result;
    }

    public static int multiplication(int a, int b) {

        return a * b;
    }

}
