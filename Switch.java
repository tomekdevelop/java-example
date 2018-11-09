public class Switch {
    public static void main(String[] args) {

        Direction direction = Direction.UNDOMN;


        switch (direction) {
            case LEFT:
                System.out.println("Lewo");
                break;
            case RIGHT:
                System.out.println("Prawo");
                break;
            case UP:
                System.out.println("Gora");
                break;
            case DOWN:
                System.out.println("dol");
                break;
            default:
                System.out.println("Brak kierunku");
        }


        int year = -2000;
        String era;
        if (year < 0) {
            era = "BC";
        } else {
            era = "AD";
        }

        era = year < 0 ? "BC" : "AD"; // skrcona wersja if

    }

    enum Direction {
        LEFT, RIGHT, UP, DOWN, UNDOMN
    }
}
