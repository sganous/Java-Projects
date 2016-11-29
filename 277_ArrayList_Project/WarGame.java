import java.util.*;
public class WarGame {
	public static void main(String[] args){
		Deck cards = new Deck();
		cards.shuffle();
		cards.sort();	
		cards.print();		
		cards.play();
		
	}

}
