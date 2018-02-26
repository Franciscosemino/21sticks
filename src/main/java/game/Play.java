package game;

import game.Game;

import java.util.Scanner;
public class Play {
    public static void main(String[] args) {
        Game game = new Game();
        int whoplays = 1;
        while (game.getsticks() > 0) {
            System.out.println("Player number '" + whoplays + "' is your turn \n if you want take 1 stick enter number '1' if you want take 2 sticks please enter number '2'");
            try {
                int i = new Scanner(System.in).nextInt();
                if (i == 2) {
                    game.taketwo();
                } else if (i == 1) {
                    game.takeone();
                } else {
                    System.out.println("please enter a number 1 or 2");
                    continue;
                }
            }
            catch (java.util.InputMismatchException error) {
                System.out.println("Please enter a valid number");
                continue;
            }

            if(whoplays == 1) {
                whoplays = 2;
            } else {
                whoplays = 1;
            }
        }
        System.out.println("Player number '" + whoplays + "' You Win \n Game over !");
    }
}
