public class Grid {
    private Square[][] squares;
    private static final int SIZE = 3;

    public Grid() {
        squares = new Square[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                squares[i][j] = new Square((char) ('A' + j), i + 1);
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (squares[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean placeSymbol(int row, int col, Symbol symbol) {
        if (squares[row][col].isEmpty()) {
            squares[row][col].setSymbol(symbol);
            return true;
        }
        return false;
    }

    public boolean checkWin(Symbol symbol) {
        for (int i = 0; i < SIZE; i++) {
            if ((squares[i][0].getSymbol() == symbol && squares[i][1].getSymbol() == symbol && squares[i][2].getSymbol() == symbol) ||
                (squares[0][i].getSymbol() == symbol && squares[1][i].getSymbol() == symbol && squares[2][i].getSymbol() == symbol)) {
                return true;
            }
        }
        if ((squares[0][0].getSymbol() == symbol && squares[1][1].getSymbol() == symbol && squares[2][2].getSymbol() == symbol) ||
            (squares[0][2].getSymbol() == symbol && squares[1][1].getSymbol() == symbol && squares[2][0].getSymbol() == symbol)) {
            return true;
        }
        return false;
    }

    public void displayBoard() {
        System.out.println("    A   B   C");
        System.out.println("  -------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(squares[i][j].getSymbol().getValue() + " | ");
            }
            System.out.println("\n  -------------");
        }
    }

    public int[] getCoordinates(String move) {
        if (move.length() != 2) return null;
        int row = move.charAt(1) - '1';
        int col = move.charAt(0) - 'A';
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
            return new int[]{row, col};
        }
        return null;
    }
}