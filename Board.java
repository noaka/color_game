import java.util.Random;

public class Board {

    public int size;
    public int[][] Bd;


    public Board(int size) {
        this.size = size;
        Bd = new int[size][size];
        initializeBoard();
        printBoard();
    }


    private void initializeBoard() {

        //print the board game
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Random rand = new Random();
                Bd[i][j] = rand.nextInt(4) + 1;
            }

        }

    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num = Bd[i][j];
                //System.out.print("|");
                System.out.print(Color.colorcell(num) + "|");
            }
            System.out.println();
        }
    }

    public void insertColor(int num) {
        int lastColor = Bd[0][0];
        if (num > 0 && num < 5)
            changeColors(lastColor, num);
    }

    public void changeColors(int lc, int num) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Bd[i][j] == lc)
                    Bd[i][j] = num;
                else
                    break;
            }
        }
    }

    public boolean checkBoard() {

        int val = Bd[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Bd[i][j] != val)
                    return false;
            }
        }
        return true;
    }



}

