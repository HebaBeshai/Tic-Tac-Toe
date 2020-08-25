/***********************************************************************************************************************
 * @file  TicTacToe.java
 * @brief Generates a grid that allows mouse clicks on the middle of the box to generate o's & x's
 * @author Heba Beshai
 * @date   February 26, 2016
 ***********************************************************************************************************************/
public class TicTacToe {
    public static void main(String[] args) {
        // variables
        int turn;
        double x, y;// variable to keep track of the current turn using 2 values.
        String player1;
        String player2;// For example, use 1 to denote player 1's turn (O) and another number like 2 to denote player 2's turn (X)


        int plays = 0;
        turn = 1;
        StdDraw.setXscale(0, 3);
        StdDraw.setYscale(0, 3);
        int i;

        i = 0;
        while (i <= 3) {
            StdDraw.line(i, 0, i, 3);
            StdDraw.line(0, i, 3, i);
            i++;
        }

        double xLast = 1;
        double yLast = 1;
        x = 1;
        y = 1;
        while (plays < 10) {
            if (StdDraw.mousePressed()) {
                StdDraw.show(1000);
                if (x == xLast && y == yLast) {
                    x = StdDraw.mouseX();
                    y = StdDraw.mouseY();
                    // draw a circle or an x
                }

                x = Math.floor(x);
                y = Math.floor(y);
                if (plays % 2 == 0) {
                    StdDraw.circle(x + 0.5, y + 0.5, 0.5);
                } else if (plays % 2 == 1) {
                    StdDraw.line(x, y, x + 1, y + 1);
                    StdDraw.line(x, y + 1, x + 1, y);
                }
                xLast = x;
                yLast = y;
                plays++;

                if (turn == 1) {

                }
            }

        }


    }}