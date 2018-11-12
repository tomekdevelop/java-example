/*  Napisz metodę, która przyjmie od użytkownika literał (String) i wyświetli na ekran wszystkie litery alfabetu
    łacińskiego, które NIE występują w podanym Stringu.*/

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {


        System.out.println("Podaj string: ");
        String string = readString();
        generateAlfabeth(string);
    }


    public static void generateAlfabeth(String word) {
        char a;
        boolean skip = false;

        for (int i = 97; i <= 122; i++) {

            for (int j = 0; j < word.length(); j++) {

                if (i == word.codePointAt(j)) {
                    skip = false;
                    break;
                } else {
                    skip = true;
                }
            }


            if (skip) {
                System.out.print(a = (char) i);
                System.out.print(", ");
            }
        }
    }

    public static String readString() {
        Scanner scanner = new Scanner((System.in));
        String string = scanner.next();

        return string;
    }

}
