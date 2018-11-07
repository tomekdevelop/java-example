import java.util.Scanner;

/*
1. Napisz program, który wczytuje ze standardowego wejścia liczbę całkowitą n i wypisuje na standardowe wyjście wartość bezwzględną z n.
 */
public class Exercise2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int Number = in.nextInt();


        if (Number < 0) {
            Number = Number * -1;
            System.out.println(Number);
        } else {
            System.out.println(Number);
        }


    }

}
