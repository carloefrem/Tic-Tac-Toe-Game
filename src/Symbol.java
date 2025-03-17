public class Symbol {
    public static final Symbol X = new Symbol('X');
    public static final Symbol O = new Symbol('O');
    public static final Symbol EMPTY = new Symbol(' ');

    private final char value;

    private Symbol(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
