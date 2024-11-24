package com.game;

import java.util.Scanner;

class HumanPlayer extends Player{

	HumanPlayer(String name, char mark){
		this.name=name;
		this.mark=mark;
	}

	void makeMove(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int row,col;

		do{
			System.out.println("Enter the row & column");
			row=scanner.nextInt();
			col=scanner.nextInt();

		}while(!isValidMove(row,col));

		TicTacToe.placeMark(row, col, mark);
	}

}
