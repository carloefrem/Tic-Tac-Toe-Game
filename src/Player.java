public abstract class Player {
    protected String name;
    protected Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public abstract int[] makeMove(Grid grid);

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}

