package com.techreturners.tictactoe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TicTacToeTest {

    @Test
    public void checkIfPlayerOneWinsWhenFirstRowFull(){
        //Arrange
        TicTacToe ticTacToe = new TicTacToe();

        int[][] board = {{1,2,0}, {1,2,0}, {1,0,0}};
        String response = "";

        //Act
        response = ticTacToe.play(board);

        //Assert
        Assert.assertEquals("Player 1 wins!", response);
    }
    @Test
    public void checkIfPlayerTwoWinsWhenSecondRowFull(){
        //Arrange
        TicTacToe ticTacToe = new TicTacToe();

        int[][] board = {{1,2,0}, {1,2,0}, {0,2,1}};
        String response = "";

        //Act
        response = ticTacToe.play(board);

        //Assert
        Assert.assertEquals("Player 2 wins!", response);
    }
}
