import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {




        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int firstNumber = in.nextInt();



        int prev1 = 1;
        int prev2 = 1;


        if(firstNumber <=2){
            System.out.println("Kolejka "+ firstNumber + " ciag Fibonacciego: 1");
        }


            for (int i = 3; i <= firstNumber; i++) {

                int currentElement = prev1 + prev2;

                System.out.println("Fibonaci n"+i + " wynosi: "+ currentElement);

                prev2 = prev1;
                prev1 = currentElement;



        }








        }


    }

