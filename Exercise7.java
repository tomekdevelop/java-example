

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

public class Exercise7 {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5};
        int t = 3;
        int sum;
        int len = x.length;
        int remove = -1;

        while (true) {
            remove = -1;

            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    if (j != i) {
                        sum = x[i] + x[j];
                        if (t == sum) {
                            remove = j;

                            System.out.println("Remove: " + x[j]);
                            System.out.println("Remains:");
                        }
                    }
                }
            }


            if (remove > 0) {
                for (int i = 0; i < len - 1; i++) {
                    if (i < remove) {

                    } else {
                        x[i] = x[i + 1];
                    }
                }
                x[len - 1] = 0;
                len--;

                for (int i = 0; i < len; i++) {
                    System.out.println(x[i]);
                    System.out.println();
                }
            } else {
                break;
            }

        }
    }
}