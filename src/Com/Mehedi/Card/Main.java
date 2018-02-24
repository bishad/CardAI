//          Algorithm for Call Bridge
//
//TODO 1.	Scan the cards get input for 4 suits (enter 0 for exit) <DONE>
//TODO 2.	Register cards to DB <DONE>
//TODO   a.	    If you have 4 aces then shuffle again<DONE>
//TODO   b.	    If you have no ace king queen joker then shuffle again<DONE>
//TODO c.	Else go to next step
//TODO 3.	Wait for play to start
//TODO 4.	Get user input w/ suit
//TODO 5.	Register to database
//TODO 6.	Set highest played card to a variable
//TODO 7.	If you have higher card than variable then show the card then count ++
//TODO 8.	Else play the smallest card
//TODO 9.	Go to 4
//TODO 10.	If your turn to play
//TODO   a.	    Play Ace/king/queen or the lowest card
//TODO 11.	From 4 => if you have no card in that suit play a trump card
//TODO   a.	    If another one played a trump card then play trump >played card

/**
 * A java program for asist in call bridge
 *
 * @author Mehedi Hasan
 * @version 1.0.0
 */
package Com.Mehedi.Card;
//TODO BUG FIXING


import java.util.ArrayList;

public class Main {
	/**
	 * ArrayList For My Hand
	 */
	public static ArrayList<Integer> mySpade = new ArrayList<>();
	public static ArrayList<Integer> myClub = new ArrayList<>();
	public static ArrayList<Integer> myDiamond = new ArrayList<>();
	public static ArrayList<Integer> myHeart = new ArrayList<>();
	/**
	 * ArrayList For played card
	 */
	public static ArrayList<Integer> spadePlayed = new ArrayList<>();
	public static ArrayList<Integer> diamondPlayed = new ArrayList<>();
	public static ArrayList<Integer> clubPlayed = new ArrayList<>();
	public static ArrayList<Integer> heartPlayed = new ArrayList<>();
	/**
	 * ArrayList For current playing hand
	 */
	public static ArrayList<Integer> spadePlaying = new ArrayList<>();
	public static ArrayList<Integer> diamondPlaying = new ArrayList<>();
	public static ArrayList<Integer> clubPlaying = new ArrayList<>();
	public static ArrayList<Integer> heartPlaying = new ArrayList<>();

	public static int dealTaken=0;

	/**
	 * The must have MAIN method
	 *
	 * @param args nothing to add
	 */
	public static void main(String[] args){
		showHelp();
		FirstInput.firstInput();
		Show.show();
		Playing.playing();
	}
	private static void showHelp(){
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|              Welcome to Spade helper v 0.1              |");
		System.out.println("|                Developer: Mehedi Hasan                  |");
		System.out.println("|---------------------------------------------------------|");

	}
}
