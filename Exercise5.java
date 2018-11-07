import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int number = in.nextInt();
            if(number < 0){
                number *= -1;
            }


        int result = 0;

        for (int i = 0; i < number; i++) {

            result = i*i;


        }

        System.out.println(result);





    }
}
