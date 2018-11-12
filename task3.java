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

        findLongerSide(sideA, sideB, sideC);
    }


    public static void findLongerSide(int a, int b , int c){

        int hypotenuse = 0;
        int cathetusA = 0;
        int cathetusB = 0;

        if(a > b && a > c){
            hypotenuse = a;
            cathetusA = b;
            cathetusB = c;

        }else if (b > a && b > c){
            hypotenuse = b;
            cathetusA = a;
            cathetusB = c;
        }else if (c > a && c > b){
            hypotenuse = c;
            cathetusA = a;
            cathetusB = b;
        }else {
            System.out.println("Wszystkie liczby są równe :)");
            hypotenuse = 2;
        }

        boolean result = triangele(cathetusA, cathetusB, hypotenuse);
        System.out.println(result);

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
