package ticTacToe;

import static ticTacToe.State.*;

/**
 *
 * @author Jere
 */
public class Square {

    private State squareState;

    public Square() {
        this.squareState = UNMARKED;
    }

    public State getSquareState() {
        return squareState;
    }

    public void setSquareState(State squareState) {
        this.squareState = squareState;
    }    
}