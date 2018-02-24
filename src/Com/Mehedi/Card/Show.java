package Com.Mehedi.Card;

public class Show {
	public static void show() {
		System.out.println("Spade: " + Main.mySpade + "\n");
		System.out.println("Club: " + Main.myClub + "\n");
		System.out.println("Diamond: " + Main.myDiamond + "\n");
		System.out.println("Heart: " + Main.myHeart + "\n");

		System.out.println("Spade playing: " + Main.spadePlaying + "\n");
		System.out.println("Club playing: " + Main.clubPlaying + "\n");
		System.out.println("Diamond playing: " + Main.diamondPlaying + "\n");
		System.out.println("Heart playing: " + Main.heartPlaying + "\n");

		System.out.println("Spade played: " + Main.spadePlayed + "\n");
		System.out.println("Club played: " + Main.clubPlayed + "\n");
		System.out.println("Diamond played: " + Main.diamondPlayed + "\n");
		System.out.println("Heart played: " + Main.heartPlayed + "\n");

	}

	public static void show1() {

		System.out.println("Spade: " + Main.mySpade + "\tHeart: " + Main.myHeart + "\tClub: " + Main.myClub + "\tDiamond: " + Main.myDiamond + "\n\n");
	}
	public static void show2(){
		System.out.println("spadePlayed = " + Main.spadePlayed);
		System.out.println("clubPlayed = " + Main.clubPlayed);
		System.out.println("heartPlayed = " + Main.heartPlayed);
		System.out.println("diamondPlayed = " + Main.diamondPlayed);
	}
}
