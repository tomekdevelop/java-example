import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int Number = in.nextInt();


        if(Number < 0){
            Number = Number * -1;
            System.out.println(Number);
        }else{
            System.out.println(Number);
        }




    }

}
