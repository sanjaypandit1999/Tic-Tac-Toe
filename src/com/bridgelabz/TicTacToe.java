package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public  static char[] CreatBoard(){
        char[] board = new char[10];
        for (int i =0; i<board.length; i++){
            board[i] =' ';
        }
        System.out.println(board);
        return board;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] initial = CreatBoard();
        System.out.println(initial);
    }
}
