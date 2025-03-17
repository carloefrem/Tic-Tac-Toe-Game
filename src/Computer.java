import java.util.Random;

public class Computer extends Player {
    private Random random;

    public Computer(Symbol symbol) {
        super("Computer", symbol);
        this.random = new Random();
    }

    @Override
    public int[] makeMove(Grid grid) {
        int[] coordinates;
        do {
            coordinates = new int[]{random.nextInt(3), random.nextInt(3)};
        } while (!grid.placeSymbol(coordinates[0], coordinates[1], symbol));
        System.out.println("Computer chose: " + (char) ('A' + coordinates[1]) + (coordinates[0] + 1));
        return coordinates;
    }
}