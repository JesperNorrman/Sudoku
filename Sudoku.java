package sudoku;

import java.util.*;
public class Sudoku {
	
	private int[][] board; 
	
	
	
	/** Creates a Sudoku object that consists of a matrix with nine columns and nine rows. 
	 * At start the values of the boards boxes are set to zero.
	 */
	
	public Sudoku(){
		board = new int[9][9];
	}
	
	public boolean setValue(int r, int c, int value){
		if(checkInput(value) && checkBoundary(r, c)){
			board[r][c] = value;
			return true;
		}
		else
			return false;
	}
	
	public int getValue(int r, int c){
		if(checkBoundary(r, c)){
			return board[r][c];
		}
		else
			return 0;
	}
	
	public void solve(int[][] board){
		solve(0,0);
	}
	
	private boolean solve(int i, int j){
		return false;
	}
	
	/** Kontrollerar om en siffra på en specifik plats uppfyller alla spelregler.
	 */
	
	private boolean checkRules(int r, int c){
		for(int i = 0; i < 9; i++){
			//Checks the rules for the row
			if(i != r && board[i][c] == board[r][c]){
					return false;
			}
			//Checks the rules for the column
			if(i != c && board[r][i] == board[r][c]){
				return false;
			}
		}
		
		//Checks the rules for the 3x3 box of numbers
		int cs = 3*c/3;
		int rs = 3*r/3;
		
		for(int row = cs; row < 2 + cs ;row++){
			for(int col = rs; col < 2 + rs; col++){
				if(row != r && col != c && board[row][col] == board[r][c]){
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	private boolean checkInput(int value){
		return true;
	}
	
	private boolean checkBoundary(int r, int c){
		if(r >= 0 && r < 9 && c >= 0 && c < 9 ){
			return true;
		}
		else
			return false;
	}
}
