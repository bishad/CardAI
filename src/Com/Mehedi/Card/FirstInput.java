package Com.Mehedi.Card;

import java.util.Collections;
import java.util.Scanner;

public class FirstInput {
	static Scanner key=new Scanner(System.in);
	/**
	 * Input first cards
	 * into four different array list
	 */
	public static void firstInput() {
		do {
			System.out.print("Enter your Card: ");
			String input = key.nextLine();
			if (input.equalsIgnoreCase("0")) {
				break;
			}
			String suit = input.substring(0, 1);
			String card = input.substring(1, input.length());
			if (suit.equalsIgnoreCase("s")) {
				if (card.equalsIgnoreCase("j")) {
					Main.mySpade.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.mySpade.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.mySpade.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.mySpade.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.mySpade.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else if (suit.equalsIgnoreCase("c")) {
				if (card.equalsIgnoreCase("j")) {
					Main.myClub.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.myClub.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.myClub.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.myClub.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.myClub.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else if (suit.equalsIgnoreCase("h")) {
				if (card.equalsIgnoreCase("j")) {
					Main.myHeart.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.myHeart.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.myHeart.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.myHeart.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.myHeart.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else if (suit.equalsIgnoreCase("d")) {
				if (card.equalsIgnoreCase("j")) {
					Main.myDiamond.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.myDiamond.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.myDiamond.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.myDiamond.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.myDiamond.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else {
				System.out.println("Please input valid character");
			}
		} while (true);
		checkForPlay();
		sort();
	}
	/**
	 * sort the cards in ascending order
	 */
	public static void sort(){
		Collections.sort(Main.mySpade);
		Collections.sort(Main.myDiamond);
		Collections.sort(Main.myHeart);
		Collections.sort(Main.myClub);
	}
	/**
	 * Check if you have 4 aces or
	 * no images or
	 * no card of a suit
	 */
	public static void checkForPlay(){
		if (Main.mySpade.contains(14) && Main.myDiamond.contains(14) && Main.myHeart.contains(14) && Main.myClub.contains(14)) {
			System.out.println("You Have FOUR ACES!!\n Shuffle again");
		}
		if (!(Main.myClub.contains(11) || Main.myClub.contains(12) || Main.myClub.contains(13) || Main.myClub.contains(14) ||
				Main.mySpade.contains(11) || Main.mySpade.contains(12) || Main.mySpade.contains(13) || Main.mySpade.contains(14) ||
				Main.myDiamond.contains(11) || Main.myDiamond.contains(12) || Main.myDiamond.contains(13) || Main.myDiamond.contains(14) ||
				Main.myHeart.contains(11) || Main.myHeart.contains(12) || Main.myHeart.contains(13) || Main.myHeart.contains(14))) {
			System.out.println("You Have no King, Queen, Jack or Ace.\nShuffle again.");
		}
		if (Main.mySpade.isEmpty()) {
			System.out.println("You have no card of Spade Suit!");
		}
		if (Main.myClub.isEmpty()) {
			System.out.println("You have no card of Club Suit!");
		}
		if (Main.myDiamond.isEmpty()) {
			System.out.println("You have no card of Diamond Suit!");
		}
		if (Main.myHeart.isEmpty()) {
			System.out.println("You have no card of Heart Suit!");
		}
	}
}
