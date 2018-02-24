package Com.Mehedi.Card;
//TODO DONE
import java.util.Scanner;

public class Playing {

	static Scanner key =new Scanner(System.in);
	public static void playing(){
		int var;
		int sSize=Main.mySpade.size();
		int cSize=Main.myClub.size();
		int hSize=Main.myHeart.size();
		int dSize=Main.myDiamond.size();

		do {
			Show.show1();
//			Show.show2();
			System.out.print("1. Your Turn\n2. Others turn\nYour Choice: ");
			var = key.nextInt();
			if (var==1){
				Turn.myTurn();
			}else if (var==2){
				Turn.othersTurn();
			}else {
				System.out.println("Please input ONE or TWO.");
			}
			sSize=Main.mySpade.size();
			cSize=Main.myClub.size();
			hSize=Main.myHeart.size();
			dSize=Main.myDiamond.size();
		} while (sSize!=0||dSize!=0||cSize!=0||hSize!=0);

	}
}
