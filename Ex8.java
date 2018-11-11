/*8. Istnieją dwie grupy walczących liter. Napisz program, który wczytuje String rozgrywki składający się z liter oraz decyduje, która grupa zwyciężyła turę.

        Lewa strona:
        w - 4
        p - 3
        b - 2
        s - 1

        Prawa strona:
        m - 4
        q - 3
        d - 2
        z - 1

        Pozostałe litery nie mają znaczenia w rozgrywce.
        Przykład: "zdqmwpbs"
        Przydatna będzie metoda: String.toCharArray*/

/*
import java.util.Scanner;
import java.lang.String;

public class Ex8 {
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

    public static String readString() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Wpisz string rozgrywki: ");
        String gameString = scanner.next();

        return gameString;
    }


}
*/
