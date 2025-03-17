public class Square {
    private Symbol symbol;
    private final char vCoordinate;
    private final int hCoordinate;
    
    public Square(char vCoordinate, int hCoordinate) {
        this.symbol = Symbol.EMPTY;
        this.vCoordinate = vCoordinate;
        this.hCoordinate = hCoordinate;
    }

    public boolean isEmpty() {
        return symbol == Symbol.EMPTY;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public char getVCoordinate() {
        return vCoordinate;
    }

    public int getHCoordinate() {
        return hCoordinate;
    }
}
