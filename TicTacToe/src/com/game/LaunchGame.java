package com.game;

public class LaunchGame {
	public static void main(String[] args) {
		new TicTacToe();

		HumanPlayer player1 = new HumanPlayer("Bob",'X');
		AIPlayer player2= new AIPlayer("John",'O');

		Player cp;

		cp=player1;

		while(true) {
			System.out.println(cp.name + " turn.");
			cp.makeMove();
			TicTacToe.disBoard();

			if(TicTacToe.checkColWin() || TicTacToe.checkDiagonalWin() 
					|| TicTacToe.checkRowWin() ) {
				System.out.println(cp.name + " has won.");
				break;

			}else if(TicTacToe.checkDraw()){
				System.out.println("Game is a draw");
				break;

			}else {
				if(cp == player1) {
					cp=player2;
				}else {
					cp=player1;
				}
			}
		} 
	}
}





