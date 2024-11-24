package com.game;

import java.util.Random;

class AIPlayer extends Player{

	AIPlayer(String name, char mark){
		this.name=name;
		this.mark=mark;
	}

	void makeMove(){
		int row;
		int col;
		do {
			Random random = new Random();
			row=random.nextInt(3);
			col=random.nextInt(3);
		}while(!isValidMove(row,col));

		TicTacToe.placeMark(row, col, mark);
	}
}
