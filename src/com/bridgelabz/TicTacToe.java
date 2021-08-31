package com.bridgelabz;

import java.util.Locale;
import java.util.Scanner;

public class TicTacToe {
    public static char playerChoice;
    public static char computerChoice;
    public  static char[] CreatBoard(){
        char[] board = new char[10];
        for (int i =0; i<board.length; i++){
            board[i] =' ';
        }
        return board;
    }
    public static void chooseLetter(Scanner scanner) {
        System.out.println("Which one you want go with ?\n" +
                "'X' or 'O'");
        while (true) {
            char letter = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
            if (letter == 'X' || letter == 'O') {
                playerChoice = letter;
                computerChoice = (letter == 'X') ? 'O' : 'X';
                break;
            } else
                System.out.println("INVALID INPUT!!!");
        }
    }
    public static void displayBoard(char[] BoardCells) {
        System.out.println("|" + BoardCells[1] + "|" + BoardCells[2] + "|" + BoardCells[3] +"|"
                + "\n" + "|" + BoardCells[4] + "|" + BoardCells[5] + "|" + BoardCells[6] + "|"
                + "\n" +"|" + BoardCells[7] + "|" + BoardCells[8] + "|" + BoardCells[9] + "|");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] initial = CreatBoard();
        displayBoard(initial);

    }
}
