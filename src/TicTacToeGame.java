import java.util.Scanner;
public class TicTacToeGame {
	/**
	 * @return
	 */
	final private static int playerTurn=0;
	final private static int computerTurn = 1;
	public static char[] makeBoard(){
		char[] board = new char[10];
		for(int i=0;i<10;i++) {
			board[i]=' ';
		}
		return board;
	}
	/**
	 * @return
	 */
	public static char chooseOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose between X and O");
		char c = sc.next().charAt(0);
		return c;
	}
	/**
	 * @param board
	 */
	public static void showBoard(char[] board){
		System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println("_____");
		System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
		System.out.println("_____");
		System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
	}
	/**
	 * @param board
	 * @param Option
	 */
	public static void checkIndex(char[] board,char Option) {
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("Please enter the index you want to enter the value at");
			int index=sc.nextInt();
			if(index>0&&index<10) {
				if(board[index]==' ') {
					board[index]=Option;
					flag=false;
					System.out.println("The value :" +Option+ "has been added to the position :"+index);
				}else {
					System.out.println("The position is already filled. Please enter a new position");
				}
			}else {
				System.out.println("The index is not valid. Please enter a valid index");
			}
		}
	}
	public static int playFirst() {
		return (int)(Math.random()*10)%2;
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
		System.out.println("This is how current board looks like");
		showBoard(newBoard);
		checkIndex(newBoard,playerOption);
		showBoard(newBoard);
		checkIndex(newBoard,computerOption);
		showBoard(newBoard);
		switch(playFirst()) {
		case playerTurn:
			System.out.println("Player will start the game");
		case computerTurn:
			System.out.println("Computer will start the game");
		}
	}
}
