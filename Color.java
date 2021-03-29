public enum Color {
    // enum fields
    Red(1), Blue(2), Green(3), Yellow(4);

    // internal state
    private int val;


    // constructor
    private Color(final int value) {
        this.val = value;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE  = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public int getValue() {
        return val;
    }

    public static String colorcell(int val) {
        if (val == 1)
            return ANSI_RED;
        if (val == 2)
            return ANSI_GREEN;
        if (val == 3)
            return ANSI_WHITE;
        if (val == 4)
            return ANSI_BLUE;
        return "error";
    }


}
