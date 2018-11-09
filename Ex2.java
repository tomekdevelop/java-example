import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int number = readNumberFromConsole(1);
        int abs = number < 0 ? number * -1: number;
        System.out.println("Wartosc bezwzgledna:" + abs);
    }

    static int countAbs(int number){
        return number < 0 ? number * -1 : number;
    }

    static int readNumberFromConsole(int numberInOrder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: "+ numberInOrder);
        return scanner.nextInt();

    }

}
