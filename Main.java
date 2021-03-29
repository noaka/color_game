import java.util.Scanner;

public class Main {




    public static void main(String[] args){

        int turn =2;
        System.out.println("start Color Game...");
        Board bg = new Board(3);
        //bg.printBoard();


        while(turn>0) {
            System.out.println("Please pick color (number)...");
            Scanner sc = new Scanner(System.in);
            bg.insertColor(sc.nextInt());
            bg.printBoard();
            if (bg.checkBoard())
                System.out.println("you won!!! Good Job");
            turn--;
        }
        System.out.println("you lose, Game Over!");

    }
}
