import java.util.*;
/**
 * @author Sergey Ganous
 * @since January 28, 2016
 * Methods in order to execute a card game of War.
 * Input: None
 * Output: None
 */
public class Deck {
	
	//Initialize Variables
	ArrayList<String> cards = new ArrayList<String>();
	ArrayList<String> player1 = new ArrayList<String>();
	ArrayList<String> player2 = new ArrayList<String>();
	ArrayList<String> tempList = new ArrayList<String>();
	
	/**
	 * Constructor to create a deck of 52 cards
	 */
	Deck(){
		cards.add("02H");
		cards.add("03H");
		cards.add("04H");
		cards.add("05H");
		cards.add("06H");
		cards.add("07H");
		cards.add("08H");
		cards.add("09H");
		cards.add("10H");
		cards.add("11H");
		cards.add("12H");
		cards.add("13H");
		cards.add("14H");
	
		cards.add("02S");
		cards.add("03S");
		cards.add("04S");
		cards.add("05S");
		cards.add("06S");
		cards.add("07S");
		cards.add("08S");
		cards.add("09S");
		cards.add("10S");
		cards.add("11S");
		cards.add("12S");
		cards.add("13S");
		cards.add("14S");
		
		cards.add("02C");
		cards.add("03C");
		cards.add("04C");
		cards.add("05C");
		cards.add("06C");
		cards.add("07C");
		cards.add("08C");
		cards.add("09C");
		cards.add("10C");
		cards.add("11C");
		cards.add("12C");
		cards.add("13C");
		cards.add("14C");
		
		cards.add("02D");
		cards.add("03D");
		cards.add("04D");
		cards.add("05D");
		cards.add("06D");
		cards.add("07D");
		cards.add("08D");
		cards.add("09D");
		cards.add("10D");
		cards.add("11D");
		cards.add("12D");
		cards.add("13D");
		cards.add("14D");
	}

	/**
	 * Method to shuffle cards in a deck.
	 */
	public void shuffle(){
		Collections.shuffle(cards);
	}
	
	/**
	 * Method to sort cards to 2 players
	 */
	public void sort(){
		for(int i=0;i<(cards.size()/2);i++){
			player1.add(cards.get(i));
			player2.add(cards.get((cards.size()/2)+i));
		}
	}
	
	/**
	 * Converts string cards into an integer value.
	 * @param card String card value.
	 * @return value Integer card value.
	 */
	public int value(String card){
		int value = Integer.parseInt(card.substring(0,2));
		return value;
	}
	
	/**
	 * Method to compare two integer values of cards.
	 * @return result Returns a value determining the greater card.
	 */
	public int compare(){
		int result;
		if(value(player1.get(0)) > value(player2.get(0))){
			result = 1;
		}
		else if(value(player1.get(0)) < value(player2.get(0))){
			result = 2;
		}
		else{
			result = 0;
		}
		
		return result;
	}
	
	/**
	 * Method to expand card name.
	 * @param card String card value.
	 * @return cardName Returns expanded car name.
	 */
	public String cardName(String card){
		String cardName;
		String cardNum;
		String cardSuit;
		
		//Converting Card Number
		if(card.substring(0,2).equals("02")){
			cardNum = "Two";
		}
		else if(card.substring(0,2).equals("03")){
			cardNum = "Three";
		}
		else if(card.substring(0,2).equals("04")){
			cardNum = "Four";
		}
		else if(card.substring(0,2).equals("05")){
			cardNum = "Five";
		}
		else if(card.substring(0,2).equals("06")){
			cardNum = "Six";
		}
		else if(card.substring(0,2).equals("07")){
			cardNum = "Seven";
		}
		else if(card.substring(0,2).equals("08")){
			cardNum = "Eight";
		}
		else if(card.substring(0,2).equals("09")){
			cardNum = "Nine";
		}
		else if(card.substring(0,2).equals("10")){
			cardNum = "Ten";
		}
		else if(card.substring(0,2).equals("11")){
			cardNum = "Jack";
		}
		else if(card.substring(0,2).equals("12")){
			cardNum = "Queen";
		}
		else if(card.substring(0,2).equals("13")){
			cardNum = "King";
		}
		else{
			cardNum = "Ace";
		}
		
		//Converting Card Suit
		if(card.substring(2,3).equals("D")){
			cardSuit = " of Diamonds";
		}
		else if(card.substring(2,3).equals("H")){
			cardSuit = " of Hearts";
		}
		else if(card.substring(2,3).equals("S")){
			cardSuit = " of Spades";
		}
		else{
			cardSuit = " of Clubs";
		}
		
		//Returning Card Strinng
		cardName = cardNum.concat(cardSuit);
		return cardName;
	}
	
	
	/**
	 * Execute card game method.
	 */
	public void play(){
		String tempCard;
		
		while(!player1.isEmpty() && !player2.isEmpty()){
			System.out.println("Player1 plays: "+ cardName(player1.get(0)));
			System.out.println("Player2 plays: "+ cardName(player2.get(0)));
			//Player1 Wins
			if(compare() == 1){
				tempCard = player1.remove(0);
				player1.add(tempCard);
				player1.add(player2.get(0));
				player2.remove(0);
				System.out.println("Player1 wins the round!");
			}
			//Player2 Wins
			else if(compare() == 2){
				tempCard = player2.remove(0);
				player2.add(tempCard);
				player2.add(player1.get(0));
				player1.remove(0);				
				System.out.println("Player2 wins the round!");
			}
			//WAR
			else if(compare() == 0){
				if(player1.size()>3 && player2.size()>3){
					war();
				}
				else{
					if(player1.size()>player2.size()){
						System.out.println("Player2 does not have enough cards to finish the war.");
						player2.clear();
					}
					else{
						System.out.println("Player1 does not have enough cards to finish the war.");
						player1.clear();
					}
				}
			}
		}
		
		//Print the Winner
		if(player1.isEmpty()){
			System.out.println("Player2 Wins!");
		}
		else{
			System.out.println("Player1 Wins!");
		}			
	}
	
	
	/**
	 * Method to determine a war winner.
	 */
	public void war(){
			System.out.println("War");
			System.out.println("Player1 submits: xx xx xx");
			System.out.println("Player2 submits: xx xx xx");
			
			//Remove 3 cards from each player
			for(int i = 0; i<3; i++){
				tempList.add(player1.remove(0));
				tempList.add(player2.remove(0));
			}
			System.out.println("Player1 war card is: "+cardName(player1.get(0)));
			System.out.println("Player2 war card is: "+cardName(player2.get(0)));
			//Decides War winner
			if(compare() == 1){
				player1.add(player2.remove(0));
				for(int i = 0;i<tempList.size();i++){
					player1.add(tempList.remove(0));
				}
				System.out.println("Player1 wins the war!");
			}
			else if(compare() == 2){
				player2.add(player1.remove(0));
				for(int i = 0;i<tempList.size();i++){
					player2.add(tempList.remove(0));
				}
				System.out.println("Player2 wins the war!");
			}
			else{
				if(player1.size()>3 && player2.size()>3){
					war();
				}
				else{
					if(player1.size()>player2.size()){
						System.out.println("Player2 does not have enough cards to finish the war.");
						player2.clear();
					}
					else{
						System.out.println("Player1 does not have enough cards to finish the war.");
						player1.clear();
					}
				}
			}
	}
		
			
	/**
	 * Method to print the hands of both players.	
	 */
	public void print(){
		System.out.println(player1);
		System.out.println(player2);
	}
}
