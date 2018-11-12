
public class test {


    public static void main(String[] args) {


        System.out.println(sumaRekurencyjna(3));
        //System.out.println(sumaIteracja(3));


    }


    public static int sumaIteracja(int n){
        int suma = 0;

        while (n > 0){
            suma = suma + n;
            n--;
        }

        return suma;
    }


    public static int sumaRekurencyjna(int n){
        System.out.println("sumaRekurencyjna " + n);
        if(n > 0){
            System.out.println("jestem w if " + n);
            return n + sumaRekurencyjna(n - 1);
        }else {
            System.out.println("else "+ n);
            return 0;
        }


    }


}
