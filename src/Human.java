import java.util.Scanner;

public class Human extends Player {
    private Scanner scanner;

    public Human(String name, Symbol symbol) {
        super(name, symbol);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int[] makeMove(Grid grid) {
        while (true) {
            System.out.print(name + ", enter move: ");
            String move = scanner.nextLine().toUpperCase();
            int[] coordinates = grid.getCoordinates(move);
            if (coordinates != null && grid.placeSymbol(coordinates[0], coordinates[1], symbol)) {
                return coordinates;
            }
            System.out.println("Invalid move, try again.");
        }
    }    
}