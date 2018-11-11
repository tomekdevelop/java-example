/*
8.1 W Stringu mogą się znaleźć również bomby - znaki '*', które wymazują przyległe litery, na przykład:
        aa*aa => a__a
        **aa** => ____

        Przykład stringów:
        zzzz*s*
        www*www****z
        *zd*qm*wp*bs*
*/


import java.util.Arrays;
import java.util.Scanner;

public class Ex8_1 {

    public static void main(String[] args) {

        String gameString = readString();
        String result = startGame(gameString);

        System.out.println(result);

    }


    public static String startGame(String word) {
        int lengthString = word.length();
        int resultLeft = 0;
        int resultRight = 0;
        String win;

        for (int i = 0; i < lengthString; i++) {

            switch (word.charAt(i)) {
                case ('w'):
                    resultLeft += 4;
                    break;
                case ('p'):
                    resultLeft += 3;
                    break;
                case ('b'):
                    resultLeft += 2;
                    break;
                case ('s'):
                    resultLeft += 1;
                    break;
                case ('m'):
                    resultRight += 4;
                    break;
                case ('q'):
                    resultRight += 3;
                    break;
                case ('d'):
                    resultRight += 2;
                    break;
                case ('z'):
                    resultRight += 1;
                    break;
                default:
            }

        }

        System.out.println("Liczba pkt lewa: " + resultLeft);
        System.out.println("Liczba pkt prawa: " + resultRight);

        if (resultLeft > resultRight) {
            win = "wygrala lewa strona";
        } else if (resultLeft < resultRight) {
            win = "wygrala prawa strona";
        } else {
            win = "remis";
        }

        return win;
    }


    public static int[] findBomb(String word) {

        int tableSize = 0;

        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == '*'){
                tableSize++;
            }
        }

        int[] indexBombNumber = new int[tableSize];
        int countBomb = 0;

        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == '*'){
                indexBombNumber[countBomb++] = i;
            }
        }

        return indexBombNumber;
    }

    public static String readString() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Wpisz string rozgrywki: ");
        String gameString = scanner.next();

        return gameString;
    }
}
