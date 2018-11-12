/*Zaimplementuj program obliczający podany element ciągu Fibonacciego w sposób
nieiteracyjny (bez używania instrukcji for, while, do-while).*/

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        int number = readNumber();

        int result = fibonacci(number);

        System.out.println(result);


    }


    public static int fibonacci(int index){

        if(index < 2){
            return index;
        } else {
            return fibonacci(index - 1) + fibonacci( index - 2);
        }


    }


    public static int readNumber() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Podaj liczbe :");
        int number = scanner.nextInt();


        return number;
    }

}
