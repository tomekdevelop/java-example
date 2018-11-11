public class Ex4 {

    public static void main(String[] args) {

        //System.out.println(fibonacciIteracja(6));
        System.out.println(fibonacciEwkurencja(5));
    }

    public static int fibonacciIteracja(int n){


        int pierwszy = 1;
        int drugi = 1;
        int pomocnicza = 1;
        int count =1;
        for (int i = 2; i < n; i++) {
            pomocnicza = pierwszy + drugi;
            pierwszy = drugi;
            drugi = pomocnicza;
            System.out.println("licznik: " + count++);
        }

        return pomocnicza;

    }

    public static int fibonacciEwkurencja(int n){

        if(n < 2){
            return n;
        }else {
            return fibonacciEwkurencja(n -1) + fibonacciEwkurencja(n - 1);
        }
    }
}
