public class ExerciseOne {

    public static void main(String[] args) {

        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;


        double result = ((coordinateX2 - coordinateX1) + (coordinateY2 - coordinateY1));

        double sqrt = Math.sqrt(result);
        double power = Math.pow(result,2);
        System.out.println(sqrt);
    }
}
