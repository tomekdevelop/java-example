public class MultiArray {

    public static void main(String[] args) {

        int[][] gameBoard = new int[10][10];


        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }


        int [][] gameBoard2 = new int[10][];
        //inicjalizacja
        for (int i = 0; i < 10; i++) {
            gameBoard2[i] = new int[i];
        }


    }
}
