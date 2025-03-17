import java.util.Scanner;

public class GameLogic {
    private Scanner scanner;

    public GameLogic() {
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        while (true) {
            Grid grid = new Grid();
            System.out.println("Welcome to Tic-Tac-Toe Game!");
            System.out.print("Enter name for Player 1: ");
            Player player1 = new Human(scanner.nextLine(), Symbol.X);

            System.out.print("Do you want to play against another Human or Computer? : ");
            Player player2;
            if (scanner.nextLine().trim().equalsIgnoreCase("Computer")) {
                player2 = new Computer(Symbol.O);
            } else {
                System.out.print("Enter name for Player 2: ");
                player2 = new Human(scanner.nextLine(), Symbol.O);
            }
            
            Player currentPlayer = player1;
            grid.displayBoard();
            
            boolean gameEnded = false;
            while (!gameEnded) {
                currentPlayer.makeMove(grid);
                grid.displayBoard();
                if (grid.checkWin(currentPlayer.getSymbol())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    gameEnded = true;
                } else if (grid.isFull()) {
                    System.out.println("It's a draw!");
                    gameEnded = true;
                } else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    } else {
                        currentPlayer = player1;
                    }
                }
            }
            
            System.out.print("Do you want to play again? : ");
            if (!scanner.nextLine().trim().equalsIgnoreCase("yes")) {
                System.out.println("Game over.");
                break;
            }
        }
    }
}