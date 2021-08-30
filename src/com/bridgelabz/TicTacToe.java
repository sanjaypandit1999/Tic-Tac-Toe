package com.bridgelabz;

public class TicTacToe {
    public  static char[] CreatBoard(){
        char[] board = new char[10];
        for (int i =0; i<board.length; i++){
            board[i] =' ';
        }
        System.out.println(board);
        return  board;
    }

    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.CreatBoard();
    }
}
