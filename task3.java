/*Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości
przekazanych w argumentach można zbudować trójkąt prostokątny.*/


import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        System.out.println("Podaj bok a :");
        int sideA = readNumber();
        System.out.println("Podaj bok b :");
        int sideB = readNumber();
        System.out.println("Podaj bok c :");
        int sideC = readNumber();

        System.out.println(triangele(sideA, sideB, sideC));
    }


    

    public static boolean triangele(int a, int b, int c){

        if((a*a + b*b) == c*c){
            return true;
        }

        return false;
    }


    public static int readNumber() {
        Scanner scanner = new Scanner((System.in));
        int number = scanner.nextInt();

        return number;
    }

}
