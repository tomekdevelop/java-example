public class ExampleFunction {

    public static void main(String[] args) {
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] xCoordinates = {5, 6, 7, 8, 9};


        int xCoordinatesSum = countSumOfElements(xCoordinates);
        int yCoordinatesSum = countSumOfElements(yCoordinates);
        double yCoordinatesAverage = arithmeticAverage(yCoordinates);
        double xCoordinatesAverage = arithmeticAverage(xCoordinates);

        System.out.println("Suma x = " + xCoordinatesSum);
        System.out.println("Suma y = " + yCoordinatesSum);
        System.out.println("Srednia y = " + yCoordinatesAverage);
        System.out.println("Srednia x = " + xCoordinatesAverage);

    }


    static int countSumOfElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];

        }

        return sum;
    }

    static double arithmeticAverage(int[] inputArray) {
        double average = 0;
        double sum = countSumOfElements(inputArray);
        int inputArrayLength = inputArray.length;

        average = sum / inputArrayLength;

        return average;

    }

    static double countVelocity(double time, double route) {
        double velocity = route / time;
        System.out.println(velocity);

        return velocity;
    }


}
