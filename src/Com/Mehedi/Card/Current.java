package Com.Mehedi.Card;
import java.util.ArrayList;
import java.util.Scanner;

public class Current {
	private static Scanner key = new Scanner(System.in);

	public static ArrayList<String> playedSuit =new ArrayList<>();
	public static void currentGameInput() {


		do {
			System.out.print("Enter current playing card: ");
			String input = key.nextLine();
			if (input.equalsIgnoreCase("0")) {
				break;
			}
			String suit = input.substring(0, 1);
			playedSuit.add(suit);
			String firstElementOfSUIT= playedSuit.get(0);
			String secondElementOfSUIT= null;
			try {
				secondElementOfSUIT = playedSuit.get(1);
			}catch (Exception e){

			}
			if (firstElementOfSUIT.equalsIgnoreCase(secondElementOfSUIT)){
				playedSuit.clear();
				playedSuit.add(suit);

			}
			String card = input.substring(1, input.length());
			if (suit.equalsIgnoreCase("s")) {
				if (card.equalsIgnoreCase("j")) {
					Main.spadePlaying.add(11);
					Main.spadePlayed.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.spadePlaying.add(12);
					Main.spadePlayed.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.spadePlaying.add(13);
					Main.spadePlayed.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.spadePlaying.add(14);
					Main.spadePlayed.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.spadePlaying.add(cardN);
						Main.spadePlayed.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else if (suit.equalsIgnoreCase("c")) {
				if (card.equalsIgnoreCase("j")) {
					Main.clubPlaying.add(11);
					Main.clubPlayed.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.clubPlaying.add(12);
					Main.clubPlayed.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.clubPlaying.add(13);
					Main.clubPlayed.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.clubPlaying.add(14);
					Main.clubPlayed.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.clubPlaying.add(cardN);
						Main.clubPlayed.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else if (suit.equalsIgnoreCase("h")) {
				if (card.equalsIgnoreCase("j")) {
					Main.heartPlaying.add(11);
					Main.heartPlayed.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.heartPlaying.add(12);
					Main.heartPlayed.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.heartPlaying.add(13);
					Main.heartPlayed.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.heartPlaying.add(14);
					Main.heartPlayed.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.heartPlaying.add(cardN);
						Main.heartPlayed.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else if (suit.equalsIgnoreCase("d")) {
				if (card.equalsIgnoreCase("j")) {
					Main.diamondPlaying.add(11);
					Main.diamondPlayed.add(11);
				} else if (card.equalsIgnoreCase("q")) {
					Main.diamondPlaying.add(12);
					Main.diamondPlayed.add(12);
				} else if (card.equalsIgnoreCase("k")) {
					Main.diamondPlaying.add(13);
					Main.diamondPlayed.add(13);
				} else if (card.equalsIgnoreCase("a")) {
					Main.diamondPlaying.add(14);
					Main.diamondPlayed.add(14);
				} else {
					int cardN = Integer.parseInt(card);
					if (cardN == 2 || cardN == 3 || cardN == 4 || cardN == 5 || cardN == 6 || cardN == 7 || cardN == 8 || cardN == 9 || cardN == 10 || cardN == 11 || cardN == 12 || cardN == 13 || cardN == 14) {
						Main.diamondPlaying.add(cardN);
						Main.diamondPlayed.add(cardN);
					} else {
						System.out.println("Please input valid character");
					}
				}
			} else {
				System.out.println("Please input valid character");
			}
		} while (true);
	}



}
