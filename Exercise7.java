

/*
7. Dana jest wejściowa tablica integerów. Należy znaleźć czy istnieją pary liczb sumujące się do podanej sumy (t).
    Jeśli tak, należy usunąć drugą liczbę z pary z tablicy i zwrócić tablicę wynikową.
    Przykład:

    x = [1, 2, 3, 4, 5]
    t = 3

    1+2 = t, więc wyrzucamy 2. Żadna inna para nie sumuje się do t, więc wynikiem jest:
    [1, 3, 4, 5]

 */

import java.util.Scanner;

public class
Exercise7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy:");
        int numberTabLength = in.nextInt();

        int tableLength = 0;
        int sumNumber = 0;
        boolean initTableLength = true;


        // wczytanie danych
        while (initTableLength) {
            if (numberTabLength < 0) {
                System.out.println("Tablica nie moze miec ujemnej dlugosci!!! ");
                break;
            } else {
                tableLength = numberTabLength;
                initTableLength = false;
            }

            System.out.println("Podaj sume liczb:");
            int userAddSumNumber = in.nextInt();


            if (userAddSumNumber < 0) {
                System.out.println("Suma nie moze być liczba ujemna!!!");
                break;
            } else {
                sumNumber = userAddSumNumber;
            }
        }

        // tworzenie tablicy

        int[] table = new int[tableLength];

        for (int i = 0; i < table.length; i++) {

            table[i] = i + 1;
        }

        System.out.println("tablica integer");
        for (int x : table) {


            System.out.print(x + ", ");
        }


    }
}
