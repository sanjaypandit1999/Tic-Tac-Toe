package com.bridgelabz;

import java.util.Locale;
import java.util.Scanner;

public class TicTacToe {
    public static char playerChoice;
    public static char computerChoice;
    static char[] board = new char[10];
    public  static char[] CreatBoard(){
        for (int i = 0; i<10; i++){
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
    public static void displayBoard() {
        System.out.println("|" + board[1] + "|" + board[2] + "|" + board[3] +"|"
                + "\n" + "|" + board[4] + "|" + board[5] + "|" + board[6] + "|"
                + "\n" +"|" + board[7] + "|" + board[8] + "|" + board[9] + "|");
    }
     public static boolean isCellAvailable(char[] boardCells, int index) {
        return boardCells[index] == ' ';
    }
    public static void makeMoveForEmptyCells(Scanner scanner) {
        System.out.println("Player's Turn : ");
        int movePlayer = scanner.nextInt();
        if (movePlayer == 0 || movePlayer > 10)
            System.out.println("INVALID INPUT!!!");
        else if (isCellAvailable(board, movePlayer)) {
            board[movePlayer] = playerChoice;
        } else
            System.out.println("Position is taken");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] initial = CreatBoard();
        chooseLetter(sc);
        displayBoard();
        makeMoveForEmptyCells(sc);
        displayBoard();
    }
}
