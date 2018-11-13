/*
        1. Stwórz enum oznaczający operacje matematyczne (+,-,*,/)
        2. Wyświetla na ekranie dostępne opcje w formacie
            1. dodawanie
            2. odejmowanie
            ...
        3. Pobierz opcję z klawiatury
        - jeżeli taki enum nie istnieje to pobierz kolejny raz, dopóki nie zostanie podany poprawny
        4. Pobierz z klawiatury ilość parametrów, które będą poddawane działaniom
        5. Pobierz tyle liczb, ile podano powyżej
        6. Na tych liczbach wykonaj operację wybraną na początku
        7. Wyświetl całe działanie
        8. Wyświetl wynik

        przykład:
        1. dodawanie
        2. odejmowanie
        3. mnożenie
        4. dzielenie
        Wybierz operację: 1
        Podaj ilość liczb: 3
        Podaj liczby:
        1
        2
        4
        Operacja: 1 + 2 + 4
        Wynik: 7

*/

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        System.out.println("1. dodawanie");
        System.out.println("2. odejmowanie");
        System.out.println("3. mnożenie");
        System.out.println("4. dzielenie");
        System.out.println("Wybierz operacje: ");
        int operationNumber = selectOperations();

        while (operationNumber > 4 || operationNumber < 1) {
            System.out.println("Wybierz operacje: ");
            operationNumber = selectOperations();
        }

        int numberOfNumbers = numberOfNumbers();

        int[] table = createTableNumbers(numberOfNumbers);

//        for (int i = 0; i < table.length ; i++) {
//
//            System.out.print(table[i]);
//            System.out.print(", ");
//        }

//        if(operationNumber == 1){
//
//        }

    }

    public static int[] createTableNumbers(int lengthTable) {

        int[] table = new int[lengthTable];

        System.out.println("Podaj liczby: ");

        for (int i = 0; i < table.length; i++) {
            Scanner scanner = new Scanner((System.in));
            table[i] = scanner.nextInt();
        }
        return table;
    }

    public static int numberOfNumbers() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Podaj ilość liczb: ");
        int numberOfNumbers = scanner.nextInt();

        return numberOfNumbers;
    }

    public static int selectOperations() {
        Scanner scanner = new Scanner((System.in));
        int operationNumber = scanner.nextInt();

        return operationNumber;
    }

    enum Operators {
        ADDITION, SUBTRACTION, MULTIPLITACION, DIVISION
    }
}
