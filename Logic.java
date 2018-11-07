public class Logic {

    public static void main(String[] args) {
        boolean isCiricle = true;
        double r = 5.25;

        if(isCiricle && r > 10){
            System.out.println("To jest duze kolo");
        }else if(isCiricle){
            System.out.println("To jest male kolo");
        }else {
            System.out.println("To nie jest w ogole kolo.");
        }
    }
}
