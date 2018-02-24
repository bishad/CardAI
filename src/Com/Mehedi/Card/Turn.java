package Com.Mehedi.Card;

//TODO myTurn half DONE
//TODO othersTurn HALF DONE
public class Turn {

	private static int max;

//	public static void main(String[] args) {
//		int sizeOfDiamond =2; //Main.myDiamond.size();
//		int sizeOfHeart =3; //Main.myHeart.size();
//		int sizeOfClub =4; //Main.myClub.size();
//		int min = 20;
//		if (min > sizeOfClub)
//			min = sizeOfClub;
//		if (min > sizeOfDiamond)
//			min = sizeOfDiamond;
//		if (min > sizeOfHeart)
//			min = sizeOfHeart;
//		int[] MIN = {sizeOfClub, sizeOfDiamond, sizeOfHeart};
//		System.out.println(MIN[0]);
//
//	}


	public static void myTurn() {
		int sizeOfDiamond = Main.myDiamond.size();
		if (sizeOfDiamond==0){
			sizeOfDiamond=200;
		}
		int sizeOfHeart = Main.myHeart.size();
		if (sizeOfHeart==0){
			sizeOfHeart=200;
		}
		int sizeOfClub = Main.myClub.size();
		if (sizeOfClub==0){
			sizeOfClub=200;
		}
		int min = 20;
		if (min > sizeOfClub) {
			min = sizeOfClub;
		}else if (min > sizeOfDiamond) {
			min = sizeOfDiamond;
		}else if (min > sizeOfHeart) {
			min = sizeOfHeart;
		}
		int[] MIN = {sizeOfClub, sizeOfDiamond, sizeOfHeart};
//		MIN[0]=sizeOfClub;


		if (min == sizeOfDiamond) {
			if (Main.diamondPlayed.size() == 0) {
				if (Main.myDiamond.contains(14)) {
					System.out.println("Play ACE of DIAMOND.");
					Main.diamondPlayed.add(Main.myDiamond.get(Main.myDiamond.indexOf(14)));
					Main.myDiamond.remove(Main.myDiamond.indexOf(14));
					Main.dealTaken++;
				} else {
					if (Main.myDiamond.size() != 0) {
						System.out.println("Play " + Main.myDiamond.get(0) + " of DIAMOND.");
						Main.diamondPlayed.add(Main.myDiamond.get(0));
						Main.myDiamond.remove(0);
					}
				}
			} else if (Main.diamondPlayed.contains(14)) {
				if (Main.myDiamond.contains(13)) {
					System.out.println("Play KING of DIAMOND.");
					Main.diamondPlayed.add(Main.myDiamond.get(Main.myDiamond.indexOf(13)));
					Main.myDiamond.remove(Main.myDiamond.indexOf(13));
					Main.dealTaken++;
				} else {
					if (Main.myDiamond.size() != 0) {
						System.out.println("Play " + Main.myDiamond.get(0) + " of DIAMOND.");
						Main.diamondPlayed.add(Main.myDiamond.get(0));
						Main.myDiamond.remove(0);
					}
				}
			} else if (Main.diamondPlayed.contains(14) && Main.diamondPlayed.contains(13)) {
				if (Main.myDiamond.contains(12)) {
					System.out.println("Play QUEEN of DIAMOND.");
					Main.diamondPlayed.add(Main.myDiamond.get(Main.myDiamond.indexOf(12)));
					Main.myDiamond.remove(Main.myDiamond.indexOf(12));
					Main.dealTaken++;
				} else {
					if (Main.myDiamond.size() != 0) {
						System.out.println("Play " + Main.myDiamond.get(0) + " of DIAMOND.");
						Main.diamondPlayed.add(Main.myDiamond.get(0));
						Main.myDiamond.remove(0);
					}
				}
			} else if (Main.diamondPlayed.contains(14) && Main.diamondPlayed.contains(13) && Main.diamondPlayed.contains(12)) {
				if (Main.myDiamond.contains(11)) {
					System.out.println("Play JOKER of DIAMOND.");
					Main.diamondPlayed.add(Main.myDiamond.get(Main.myDiamond.indexOf(11)));
					Main.myDiamond.remove(Main.myDiamond.indexOf(11));
					Main.dealTaken++;
				} else {
					if (Main.myDiamond.size() != 0) {
						System.out.println("Play " + Main.myDiamond.get(0) + " of DIAMOND.");
						Main.diamondPlayed.add(Main.myDiamond.get(0));
						Main.myDiamond.remove(0);
					}
				}
			} else {
				if (Main.myDiamond.size() != 0) {
					System.out.println("Play " + Main.myDiamond.get(0) + " of DIAMOND.");
					Main.diamondPlayed.add(Main.myDiamond.get(0));
					Main.myDiamond.remove(0);
				}
			}
		} else if (min == sizeOfClub) {
			if (Main.clubPlayed.size() == 0) {
				if (Main.myClub.contains(14)) {
					System.out.println("Play ACE of CLUB.");
					Main.clubPlayed.add(Main.myClub.get(Main.myClub.indexOf(14)));
					Main.myClub.remove(Main.myClub.indexOf(14));
					Main.dealTaken++;
				} else {
					if (Main.myClub.size() != 0) {
						System.out.println("Play " + Main.myClub.get(0) + " of CLUB.");
						Main.clubPlayed.add(Main.myClub.get(0));
						Main.myClub.remove(0);
					}

				}
			} else if (Main.clubPlayed.contains(14)) {
				if (Main.myClub.contains(13)) {
					System.out.println("Play KING of CLUB.");
					Main.clubPlayed.add(Main.myClub.get(Main.myClub.indexOf(13)));
					Main.myClub.remove(Main.myClub.indexOf(13));
					Main.dealTaken++;
				} else {
					if (Main.myClub.size() != 0) {
						System.out.println("Play " + Main.myClub.get(0) + " of CLUB.");
						Main.clubPlayed.add(Main.myClub.get(0));
						Main.myClub.remove(0);
					}
				}
			} else if (Main.clubPlayed.contains(14) && Main.clubPlayed.contains(13)) {
				if (Main.myClub.contains(12)) {
					System.out.println("Play QUEEN of CLUB.");
					Main.clubPlayed.add(Main.myClub.get(Main.myClub.indexOf(12)));
					Main.myClub.remove(Main.myClub.indexOf(12));
					Main.dealTaken++;
				} else {
					if (Main.myClub.size() != 0) {
						System.out.println("Play " + Main.myClub.get(0) + " of CLUB.");
						Main.clubPlayed.add(Main.myClub.get(0));
						Main.myClub.remove(0);
					}
				}
			} else if (Main.clubPlayed.contains(14) && Main.clubPlayed.contains(13) && Main.clubPlayed.contains(12)) {
				if (Main.myClub.contains(11)) {
					System.out.println("Play JOKER of CLUB.");
					Main.clubPlayed.add(Main.myClub.get(Main.myClub.indexOf(11)));
					Main.myClub.remove(Main.myClub.indexOf(11));
					Main.dealTaken++;
				} else {
					if (Main.myClub.size() != 0) {
						System.out.println("Play " + Main.myClub.get(0) + " of CLUB.");
						Main.clubPlayed.add(Main.myClub.get(0));
						Main.myClub.remove(0);
					}
				}
			} else {
				if (Main.myClub.size() != 0) {
					System.out.println("Play " + Main.myClub.get(0) + " of CLUB.");
					Main.clubPlayed.add(Main.myClub.get(0));
					Main.myClub.remove(0);
				}
			}
		} else if (min == sizeOfHeart) {
			if (Main.heartPlayed.size() == 0) {
				if (Main.myHeart.contains(14)) {
					System.out.println("Play ACE of HEART.");
					Main.heartPlayed.add(Main.myHeart.get(Main.myHeart.indexOf(14)));
					Main.myHeart.remove(Main.myHeart.indexOf(14));
					Main.dealTaken++;
				} else {
					if (Main.myHeart.size() != 0) {
						System.out.println("Play " + Main.myHeart.get(0) + " of HEART.");
						Main.heartPlayed.add(Main.myHeart.get(0));
						Main.myHeart.remove(0);
					}

				}
			} else if (Main.heartPlayed.contains(14)) {
				if (Main.myHeart.contains(13)) {
					System.out.println("Play KING of HEART.");
					Main.heartPlayed.add(Main.myHeart.get(Main.myHeart.indexOf(13)));
					Main.myHeart.remove(Main.myHeart.indexOf(13));
					Main.dealTaken++;
				} else {
					if (Main.myHeart.size() != 0) {
						System.out.println("Play " + Main.myHeart.get(0) + " of HEART.");
						Main.heartPlayed.add(Main.myHeart.get(0));
						Main.myHeart.remove(0);
					}
				}
			} else if (Main.heartPlayed.contains(14) && Main.heartPlayed.contains(13)) {
				if (Main.myHeart.contains(12)) {
					System.out.println("Play QUEEN of HEART.");
					Main.heartPlayed.add(Main.myHeart.get(Main.myHeart.indexOf(12)));
					Main.myHeart.remove(Main.myHeart.indexOf(12));
					Main.dealTaken++;
				} else {
					if (Main.myHeart.size() != 0) {
						System.out.println("Play " + Main.myHeart.get(0) + " of HEART.");
						Main.heartPlayed.add(Main.myHeart.get(0));
						Main.myHeart.remove(0);
					}
				}
			} else if (Main.heartPlayed.contains(14) && Main.heartPlayed.contains(13) && Main.heartPlayed.contains(12)) {
				if (Main.myHeart.contains(11)) {
					System.out.println("Play JOKER of HEART.");
					Main.heartPlayed.add(Main.myHeart.get(Main.myHeart.indexOf(11)));
					Main.myHeart.remove(Main.myHeart.indexOf(11));
					Main.dealTaken++;
				} else {
					if (Main.myHeart.size() != 0) {
						System.out.println("Play " + Main.myHeart.get(0) + " of HEART.");
						Main.heartPlayed.add(Main.myHeart.get(0));
						Main.myHeart.remove(0);
					}
				}
			} else {
				if (Main.myHeart.size() != 0) {
					System.out.println("Play " + Main.myHeart.get(0) + " of HEART.");
					Main.heartPlayed.add(Main.myHeart.get(0));
					Main.myHeart.remove(0);
				}
			}
		} else {
			if (Main.spadePlayed.size() > 0) {
				if (Main.mySpade.contains(14)) {
					System.out.println("Play ACE of SPADE.");
					Main.spadePlayed.add(Main.mySpade.get(Main.mySpade.indexOf(14)));
					Main.mySpade.remove(Main.mySpade.indexOf(14));
					Main.dealTaken++;
				} else if (Main.spadePlayed.contains(14)) {
					if (Main.mySpade.contains(13)) {
						System.out.println("Play KING of SPADE.");
						Main.spadePlayed.add(Main.mySpade.get(Main.mySpade.indexOf(13)));
						Main.mySpade.remove(Main.mySpade.indexOf(13));
						Main.dealTaken++;
					}
				} else if (Main.spadePlayed.contains(14) && Main.spadePlayed.contains(13)) {
					if (Main.mySpade.contains(12)) {
						System.out.println("Play QUEEN of SPADE.");
						Main.spadePlayed.add(Main.mySpade.get(Main.mySpade.indexOf(12)));
						Main.mySpade.remove(Main.mySpade.indexOf(12));
						Main.dealTaken++;
					}
				} else if (Main.spadePlayed.contains(14) && Main.spadePlayed.contains(13) && Main.spadePlayed.contains(12)) {
					if (Main.mySpade.contains(11)) {
						System.out.println("Play JOKER of SPADE.");
						Main.spadePlayed.add(Main.mySpade.get(Main.mySpade.indexOf(11)));
						Main.mySpade.remove(Main.mySpade.indexOf(11));
						Main.dealTaken++;
					}
				}

			}
		}
	}

	public static void othersTurn() {
		Current.currentGameInput();
		if (Current.playedSuit.size() == 1) {
			if (Current.playedSuit.get(0).equalsIgnoreCase("s")) {
				for (int i = 0; i < Main.spadePlaying.size(); i++) {
					if (Main.spadePlaying.get(i) > max) {
						max = Main.spadePlaying.get(i);
					}
				}
				for (int i = 0; i < Main.mySpade.size(); i++) {
					if (max < Main.mySpade.get(i)) {
						if (Main.mySpade.get(i).equals(11)) {
							System.out.println("Play JOKER of spade.");
							Main.spadePlayed.add(11);
							Main.mySpade.remove(Main.mySpade.indexOf(11));
						} else if (Main.mySpade.get(i).equals(12)) {
							System.out.println("Play QUEEN of spade.");
							Main.spadePlayed.add(12);
							Main.mySpade.remove(Main.mySpade.indexOf(12));
						} else if (Main.mySpade.get(i).equals(13)) {
							System.out.println("Play KING of spade.");
							Main.spadePlayed.add(13);
							Main.mySpade.remove(Main.mySpade.indexOf(13));
						} else if (Main.mySpade.get(i).equals(14)) {
							System.out.println("Play ACE of spade.");
							Main.spadePlayed.add(14);
							Main.mySpade.remove(Main.mySpade.indexOf(14));
						} else {
							System.out.println("Play " + Main.mySpade.get(i) + " of Spade.");
							Main.spadePlayed.add(Main.mySpade.get(i));
							Main.mySpade.remove(i);
						}
						break;
					}
				}
			} else if (Current.playedSuit.get(0).equalsIgnoreCase("c")) {
				for (int i = 0; i < Main.clubPlaying.size(); i++) {
					if (Main.clubPlaying.get(i) > max) {
						max = Main.clubPlaying.get(i);
					}
				}
				for (int i = 0; i < Main.myClub.size(); i++) {
					if (max < Main.myClub.get(i)) {
						if (Main.myClub.get(i).equals(11)) {
							System.out.println("Play JOKER of Club.");
							Main.clubPlayed.add(11);
							Main.myClub.remove(Main.myClub.indexOf(11));
						} else if (Main.myClub.get(i).equals(12)) {
							System.out.println("Play QUEEN of Club.");
							Main.clubPlayed.add(12);
							Main.myClub.remove(Main.myClub.indexOf(12));
						} else if (Main.myClub.get(i).equals(13)) {
							System.out.println("Play KING of Club.");
							Main.clubPlayed.add(13);
							Main.myClub.remove(Main.myClub.indexOf(13));
						} else if (Main.myClub.get(i).equals(14)) {
							System.out.println("Play ACE of Club.");
							Main.clubPlayed.add(14);
							Main.myClub.remove(Main.myClub.indexOf(14));
						} else {
							System.out.println("Play " + Main.myClub.get(i) + " of Club.");
							Main.clubPlayed.add(Main.myClub.get(i));
							Main.myClub.remove(i);
						}
						break;
					}
				}
			} else if (Current.playedSuit.get(0).equalsIgnoreCase("d")) {
				for (int i = 0; i < Main.diamondPlaying.size(); i++) {
					if (Main.diamondPlaying.get(i) > max) {
						max = Main.diamondPlaying.get(i);
					}
				}
				for (int i = 0; i < Main.myDiamond.size(); i++) {
					if (max < Main.myDiamond.get(i)) {
						if (Main.myDiamond.get(i).equals(11)) {
							System.out.println("Play JOKER of Diamond.");
							Main.diamondPlayed.add(11);
							Main.myDiamond.remove(Main.myDiamond.indexOf(11));
						} else if (Main.myDiamond.get(i).equals(12)) {
							System.out.println("Play QUEEN of Diamond.");
							Main.diamondPlayed.add(12);
							Main.myDiamond.remove(Main.myDiamond.indexOf(12));
						} else if (Main.myDiamond.get(i).equals(13)) {
							System.out.println("Play KING of Diamond.");
							Main.diamondPlayed.add(13);
							Main.myDiamond.remove(Main.myDiamond.indexOf(13));
						} else if (Main.myDiamond.get(i).equals(14)) {
							System.out.println("Play ACE of Diamond.");
							Main.diamondPlayed.add(14);
							Main.myDiamond.remove(Main.myDiamond.indexOf(14));
						} else {
							System.out.println("Play " + Main.myDiamond.get(i) + " of Diamond.");
							Main.diamondPlayed.add(Main.myDiamond.get(i));
							Main.myDiamond.remove(i);
						}
						break;
					}
				}
			} else if (Current.playedSuit.get(0).equalsIgnoreCase("h")) {
				for (int i = 0; i < Main.heartPlaying.size(); i++) {
					if (Main.heartPlaying.get(i) > max) {
						max = Main.heartPlaying.get(i);
					}
				}
				for (int i = 0; i < Main.myHeart.size(); i++) {
					if (max < Main.myHeart.get(i)) {
						if (Main.myHeart.get(i).equals(11)) {
							System.out.println("Play JOKER of Heart.");
							Main.heartPlayed.add(11);
							Main.myHeart.remove(Main.myHeart.indexOf(11));
						} else if (Main.myHeart.get(i).equals(12)) {
							System.out.println("Play QUEEN of Heart.");
							Main.heartPlayed.add(12);
							Main.myHeart.remove(Main.myHeart.indexOf(12));
						} else if (Main.myHeart.get(i).equals(13)) {
							System.out.println("Play KING of Heart.");
							Main.heartPlayed.add(13);
							Main.myHeart.remove(Main.myHeart.indexOf(13));
						} else if (Main.myHeart.get(i).equals(14)) {
							System.out.println("Play ACE of Heart.");
							Main.heartPlayed.add(14);
							Main.myHeart.remove(Main.myHeart.indexOf(14));
						} else {
							System.out.println("Play " + Main.myHeart.get(i) + " of Heart.");
							Main.heartPlayed.add(Main.myHeart.get(i));
							Main.myHeart.remove(i);
						}
						break;
					}
				}
			}
		} else {
			for (int i = 0; i < Main.spadePlaying.size(); i++) {
				if (Main.spadePlaying.get(i) > max) {
					max = Main.spadePlaying.get(i);
				}
			}
			for (int i = 0; i < Main.mySpade.size(); i++) {
				if (max < Main.mySpade.get(i)) {
					if (Main.mySpade.get(i).equals(11)) {
						System.out.println("Play JOKER of Spade.");
						Main.spadePlayed.add(11);
						Main.mySpade.remove(Main.mySpade.indexOf(11));
					} else if (Main.mySpade.get(i).equals(12)) {
						System.out.println("Play QUEEN of Spade.");
						Main.spadePlayed.add(12);
						Main.mySpade.remove(Main.mySpade.indexOf(12));
					} else if (Main.mySpade.get(i).equals(13)) {
						System.out.println("Play KING of Spade.");
						Main.spadePlayed.add(13);
						Main.mySpade.remove(Main.mySpade.indexOf(13));
					} else if (Main.mySpade.get(i).equals(14)) {
						System.out.println("Play ACE of Spade.");
						Main.spadePlayed.add(14);
						Main.mySpade.remove(Main.mySpade.indexOf(14));
					} else {
						System.out.println("Play " + Main.mySpade.get(i) + " of Spade.");
						Main.spadePlayed.add(Main.mySpade.get(i));
						Main.mySpade.remove(i);
					}
					break;
				}
			}
		}
	}
}
