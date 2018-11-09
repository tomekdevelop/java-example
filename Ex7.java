/*

7. Dana jest wejściowa tablica integerów. Należy znaleźć czy istnieją pary liczb sumujące się do podanej sumy (t). Jeśli tak, należy usunąć drugą liczbę z pary z tablicy i zwrócić tablicę wynikową.
    Przykład:

    x = [1, 2, 3, 4, 5]
    t = 3

    1+2 = t, więc wyrzucamy 2. Żadna inna para nie sumuje się do t, więc wynikiem jest:
    [1, 3, 4, 5]



 */


public class Ex7 {

    public static void main(String[] args) {

        int[] table = {1, 2, 3, 4, 5};
        int t = 5;




        int[] myTable = findSumNumber(table,t);

        for (int i = 0; i < myTable.length ; i++) {
            System.out.print(myTable[i]);
            System.out.print(", ");
        }

    }


    public static int[] findSumNumber(int[] table, int t) {
        int sumT = t;
        int[] findSumTable = table;
        int sumIndex;
        int[] newTable = table;

        for (int i = 0; i < findSumTable.length; i++) {

            for (int j = 0; j < findSumTable.length; j++) {

                if (i != j) {

                    sumIndex = findSumTable[i] + findSumTable[j];

                    if (sumIndex == sumT) {
                        int remove = j;

                       newTable = deleteIndexTable(findSumTable, remove);
                       return findSumNumber(newTable, t);
                    }


                }
            }

        }
        return newTable;
    }



    public static int[] deleteIndexTable(int[] table, int index) {

        int[] newTable = new int[table.length - 1];
        int newTableCounter = 0;

        for (int i = 0; i < table.length; i++) {

            if (i != index) {

                newTable[newTableCounter++] = table[i];
            }
        }

        return newTable;

    }


}
