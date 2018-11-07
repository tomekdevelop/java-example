import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1:");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int secondNumber = in.nextInt();
        System.out.println("Co chcesz zrobic?:");
        String myChar = in.next();

        String name = "+";
        String name1 = "-";

        if (name == name1){
            System.out.println("name1 jest rowne name");
        }


    }
}
