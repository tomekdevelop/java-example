public class Switch {
    public static void main(String[] args) {

        Direction direction = Direction.UNDOMN;


        switch (direction){
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

    }

    enum Direction {
        LEFT, RIGHT, UP, DOWN, UNDOMN
    }
}
