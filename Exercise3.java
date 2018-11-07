import java.util.Scanner;

/*
3. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym
wyjściu największą z ich wartości (pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).
 */

public class Exercise3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1:");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe 3:");
        int thirdNumber = in.nextInt();


       /* if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Najwieksza liczba to: " + firstNumber);
        }else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Najwieksza liczba to: " + secondNumber);
        }else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("Najwieksza liczaba to: "+ thirdNumber);
        }
        */

        int[] table = new int[3];

        table[0] = firstNumber;
        table[1] = secondNumber;
        table[2] = thirdNumber;


        int result = 0;

        for (int i = 0; i < table.length; i++) {

            if (table[i] > result) {

                result = table[i];
            }

        }

        System.out.println("Najwieksza liczba to: " + result);

    }
}
