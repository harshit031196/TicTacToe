import java.util.Scanner;
public class TicTacToeGame {
	/**
	 * @return
	 */
	final private static int playerTurn=0;
	final private static int computerTurn = 1;
	static boolean flag=true;
	/**
	 * @return
	 * Makes the board to play on
	 */
	public static char[] makeBoard(){
		char[] board = new char[10];
		for(int i=0;i<10;i++) {
			board[i]=' ';
		}
		return board;
	}
	/**
	 * @return
	 * Lets the player choose the symbol between X and O
	 */
	public static char chooseOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player, Please choose between X and O");
		char c = sc.next().charAt(0);
		return c;
	}
	/**
	 * @param board
	 * It shows the current board with all the values
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
	 * Will ask the user for an input and check if the input is valid or not. If valid, it will update the board corresponding to the input. 
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
	/**
	 * @return
	 * Returns who will play first. Will it be the player or the computer?
	 */
	public static int playFirst() {
		int turn=(int)(Math.random()*10)%2;
		if(turn==playerTurn) {
			System.out.println("Player won the toss. Player will play first");
		}
		else {
			System.out.println("Computer won the toss. Computer will play first");
		}
		return turn;
	}
	/**
	 * @param board
	 * @param computerOption
	 * @param playerOption
	 * @return
	 * Returns if after any turn, either the player or the computer won or not
	 */
	public static boolean checkWin(char[] board, char computerOption, char playerOption) {
		if((board[1]==playerOption&&board[2]==playerOption&&board[3]==playerOption)
				||(board[4]==playerOption&&board[5]==playerOption&&board[6]==playerOption)
				||(board[7]==playerOption&&board[8]==playerOption&&board[9]==playerOption)
				||(board[1]==playerOption&&board[4]==playerOption&&board[7]==playerOption)
				||(board[2]==playerOption&&board[5]==playerOption&&board[8]==playerOption)
				||(board[3]==playerOption&&board[6]==playerOption&&board[9]==playerOption)
				||(board[1]==playerOption&&board[5]==playerOption&&board[9]==playerOption)
				||(board[3]==playerOption&&board[5]==playerOption&&board[7]==playerOption)) {
			System.out.println("Player won the game");
			return false;
		}
		else if((board[1]==computerOption&&board[2]==computerOption&&board[3]==computerOption)
				||(board[4]==computerOption&&board[5]==computerOption&&board[6]==computerOption)
				||(board[7]==computerOption&&board[8]==computerOption&&board[9]==computerOption)
				||(board[1]==computerOption&&board[4]==computerOption&&board[7]==computerOption)
				||(board[2]==computerOption&&board[5]==computerOption&&board[8]==computerOption)
				||(board[3]==computerOption&&board[6]==computerOption&&board[9]==computerOption)
				||(board[1]==computerOption&&board[5]==computerOption&&board[9]==computerOption)
				||(board[3]==computerOption&&board[5]==computerOption&&board[7]==computerOption)) {
			System.out.println("Computer won the game");
			return false;
		}
		return true;
	}
	public static void playLikePlayer(char[] board, char playerOption, char computerOption) {
		if(board[1]!=playerOption&&board[2]!=playerOption&&board[3]!=playerOption) {
			if(board[1]==' ') {
				board[1]=computerOption;
			}else if(board[3]==' ') {
				board[3]=computerOption;
			}else if(board[2]==' ') {
				board[2]=computerOption;
			}
			return;
		}
		
		if(board[4]!=playerOption&&board[5]!=playerOption&&board[6]!=playerOption) {
			if(board[6]==' ') {
				board[6]=computerOption;
			}else if(board[4]==' ') {
				board[4]=computerOption;
			}else if(board[5]==' ') {
				board[5]=computerOption;
			}
			return;
		}
		if(board[7]!=playerOption&&board[8]!=playerOption&&board[9]!=playerOption) {
			if(board[7]==' ') {
				board[7]=computerOption;
			}else if(board[9]==' ') {
				board[9]=computerOption;
			}else if(board[8]==' ') {
				board[8]=computerOption;
			}
			return;
		}
		if(board[1]!=playerOption&&board[4]!=playerOption&&board[7]!=playerOption) {
			if(board[1]==' ') {
				board[1]=computerOption;
			}else if(board[7]==' ') {
				board[7]=computerOption;
			}else if(board[4]==' ') {
				board[4]=computerOption;
			}
			return;
		}
		if(board[2]!=playerOption&&board[5]!=playerOption&&board[8]!=playerOption) {
			if(board[5]==' ') {
				board[5]=computerOption;
			}else if(board[2]==' ') {
				board[2]=computerOption;
			}else if(board[8]==' ') {
				board[8]=computerOption;
			}
			return;
		}
		if(board[3]!=playerOption&&board[6]!=playerOption&&board[9]!=playerOption) {
			if(board[3]==' ') {
				board[3]=computerOption;
			}else if(board[9]==' ') {
				board[9]=computerOption;
			}else if(board[6]==' ') {
				board[6]=computerOption;
			}
			return;
		}
		if(board[1]!=playerOption&&board[5]!=playerOption&&board[9]!=playerOption) {
			if(board[1]==' ') {
				board[1]=computerOption;
			}else if(board[9]==' ') {
				board[9]=computerOption;
			}else if(board[5]==' ') {
				board[5]=computerOption;
			}
			return;
		}
		if(board[3]!=playerOption&&board[5]!=playerOption&&board[7]!=playerOption) {
			if(board[3]==' ') {
				board[3]=computerOption;
			}else if(board[7]==' ') {
				board[7]=computerOption;
			}else if(board[5]==' ') {
				board[5]=computerOption;
			}
			return;
		}
	}
	public static boolean blockOpponent(char[]board, char opponent, char self) {
		int count=0;
		if(board[1]==opponent&&board[2]==opponent&&board[3]==' ') {
			board[3]=self;
			return true;
		}
		if(board[1]==opponent&&board[3]==opponent&&board[2]==' ') {
			board[2]=self;
			return true;
		}
		if(board[2]==opponent&&board[3]==opponent&&board[1]==' ') {
			board[1]=self;
			return true;
		}
		if(board[4]==opponent&&board[5]==opponent&&board[6]==' ') {
			board[6]=self;
			return true;
		}
		if(board[5]==opponent&&board[6]==opponent&&board[4]==' ') {
			board[4]=self;
			return true;
		}
		if(board[4]==opponent&&board[6]==opponent&&board[5]==' ') {
			board[5]=self;
			flag=true;
			return true;
		}
		if(board[7]==opponent&&board[8]==opponent&&board[9]==' ') {
			board[9]=self;
			flag=true;
			return true;
		}
		if(board[7]==opponent&&board[9]==opponent&&board[8]==' ') {
			board[8]=self;
			return true;
		}
		if(board[9]==opponent&&board[8]==opponent&&board[7]==' ') {
			board[7]=self;
			return true;
		}
		if(board[1]==opponent&&board[4]==opponent&&board[7]==' ') {
			board[7]=self;
			return true;
		}
		if(board[1]==opponent&&board[7]==opponent&&board[4]==' ') {
			board[4]=self;
			return true;
		}
		if(board[4]==opponent&&board[7]==opponent&&board[1]==' ') {
			board[1]=self;
			return true;
		}
		if(board[2]==opponent&&board[5]==opponent&&board[8]==' ') {
			board[8]=self;
			return true;
		}
		if(board[2]==opponent&&board[8]==opponent&&board[5]==' ') {
			board[5]=self;
			return true;
		}
		if(board[5]==opponent&&board[8]==opponent&&board[2]==' ') {
			board[2]=self;
			return true;
		}
		if(board[3]==opponent&&board[6]==opponent&&board[9]==' ') {
			board[9]=self;
			return true;
		}
		if(board[3]==opponent&&board[9]==opponent&&board[6]==' ') {
			board[6]=self;
			return true;
		}
		if(board[6]==opponent&&board[9]==opponent&&board[3]==' ') {
			board[3]=self;
			return true;
		}
		if(board[1]==opponent&&board[5]==opponent&&board[9]==' ') {
			board[9]=self;
			return true;
		}
		if(board[1]==opponent&&board[9]==opponent&&board[5]==' ') {
			board[5]=self;
			return true;
		}
		if(board[5]==opponent&&board[9]==opponent&&board[1]==' ') {
			board[1]=self;
			return true;
		}
		if(board[3]==opponent&&board[5]==opponent&&board[7]==' ') {
			board[7]=self;
			return true;
		}
		if(board[3]==opponent&&board[7]==opponent&&board[5]==' ') {
			board[5]=self;
			return true;
		}
		if(board[5]==opponent&&board[7]==opponent&&board[3]==' ') {
			board[3]=self;
			return true;
		}
		return false;
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
//		System.out.println("Please enter the input");
//		char input = sc.next().charAt(0);
		//checking if the entered option is player's option or computer's option
//		if(input==playerOption) {
//			System.out.println("This is the player's option");
//		}else {
//			System.out.println("This is the computer's option");
//		}
//		System.out.println("This is how current board looks like");
//		showBoard(newBoard);
//		checkIndex(newBoard,playerOption);
//		showBoard(newBoard);
		int start=playFirst();
		int turn=start;
		
		for(int i=0;i<9;i++) {
			if(turn==playerTurn) {
				System.out.println("Player please make your move");
				checkIndex(newBoard,playerOption);
				showBoard(newBoard);
				if(!checkWin(newBoard,computerOption, playerOption))break;
				turn++;
				turn%=2;
			}else if(turn==computerTurn) {
				System.out.println("Computer please make your move");
				checkIndex(newBoard,computerOption);
				showBoard(newBoard);
				if(!checkWin(newBoard,computerOption, playerOption))break;
				turn++;
				turn%=2;
			}
		}
		if(checkWin(newBoard,computerOption, playerOption)) {
			System.out.println("The game ended in a draw");
		}
		System.out.println("Will youlike toplay")
	}
}
