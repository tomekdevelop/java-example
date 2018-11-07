
import java.util.Scanner;
public class Exercise1Array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1:");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int secountNumber = in.nextInt();
        System.out.println("Podaj liczbe 3:");
        int thirdNumber = in.nextInt();

        int addNumber = firstNumber + secountNumber + thirdNumber;
        int result = addNumber / 3;

        System.out.println("Srednia arytmetyczna wynosi: "+ result);


    }
}
