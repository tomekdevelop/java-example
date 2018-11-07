public class Array {

    public static void main(String[] args) {

        int xCoordinatesCount = 1000;
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] yCoordinates2 = new int[5];
            /*
                Jezeli nie przypiszemy wartosci do tablicy typow prostych (int, double, itp) to w tablicy znajduja sie 0
                jezeli tablica jest obiektem to wartosc wynosi null
             */

        yCoordinates2[0] = 1;
        yCoordinates2[1] = 2;
        yCoordinates2[2] = 3;
        yCoordinates2[3] = 4;
        yCoordinates2[4] = 5;


        System.out.println(yCoordinates2[3]);
        System.out.println(yCoordinates[3]);


        int[] xCoordinates = new int[xCoordinatesCount];

        for (int i = 0; i <  xCoordinatesCount; i++) {
            xCoordinates[i] = i;
        }

        for (int i = 0; i < xCoordinatesCount; i++) {
            System.out.println(xCoordinates[i]);
        }

    }
}
