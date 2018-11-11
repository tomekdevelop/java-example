/*

7. Dana jest wejściowa tablica integerów. Należy znaleźć czy istnieją pary liczb sumujące się do podanej sumy (t).
    Jeśli tak, należy usunąć drugą liczbę z pary z tablicy i zwrócić tablicę wynikową.
    Przykład:

    x = [1, 2, 3, 4, 5]
    t = 3

    1+2 = t, więc wyrzucamy 2. Żadna inna para nie sumuje się do t, więc wynikiem jest:
    [1, 3, 4, 5]



 */

import java.util.Arrays;

public class Ex7_by_MJ {

    public static void main(String[] args) {
        int[] array = {1, 1, 1};
        int t = 2;
        int[] result = array;
        boolean shouldRemove = true;

        while (shouldRemove) {
            array = result;
            result = removeRightSummingNumbers(array, t);
            if (array.length == result.length) {
                shouldRemove = false;
            }
        }

        System.out.println(Arrays.toString(result));
    }

    static int[] removeRightSummingNumbers(int[] array, int sum) {
        boolean[] indexesToRemove = new boolean[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + array[i + 1] == sum) {
                indexesToRemove[i + 1] = true;
                break;
            }
        }

        return removeIndexes(array, indexesToRemove);
    }

    static int[] removeIndexes(int[] array, boolean[] indexesToRemove) {
        int indexesToRemoveCount = 0;
        for (boolean indexToRemove : indexesToRemove) {
            if (indexToRemove) {
                indexesToRemoveCount++;
            }
        }

        int[] resultArray = new int[array.length - indexesToRemoveCount];
        int resultArrayIterator = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexesToRemove[i] == false) {
                resultArray[resultArrayIterator++] = array[i];
            }
        }

        return resultArray;
    }


}
