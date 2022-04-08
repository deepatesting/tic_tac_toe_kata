package com.techreturners.tictactoe;

import java.util.*;

public class TicTacToe {

    //char[][] board = new char[3][3];
    int countplayerOne = 0;
    int countplayerTwo = 0;

    public String play(int[][] board){


        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    countplayerOne++;
                    if (countplayerOne==3)
                        return "Player 1 wins!";
                }
                else if(board[i][j] == 2){
                    countplayerTwo++;
                    if (countplayerTwo==3)
                        return "Player 2 wins!";
                }

            }
        }
        return null;
    }
}
