import java.util.Scanner;

public class TicTacToeGame {
	public static char[] makeBoard(){
		char[] board = {' ', ' ',' ',' ',' ',' ',' ',' ',' ', ' '};
		return board;
	}
	public static char chooseOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose between X and O");
		char c = sc.next().charAt(0);
		return c;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		char[] newBoard = makeBoard();
		//taking the player's option
		char playerOption=chooseOption();
		char computerOption;
		if(playerOption=='X') {
			computerOption='O';
		}else {
			computerOption='X';
		}
		System.out.println("Please enter the input");
		char input = sc.next().charAt(0);
		//checking if the entered option is player's option or computer's option
		if(input==playerOption) {
			System.out.println("This is the player's option");
		}else {
			System.out.println("This is the computer's option");
		}
	}
}
