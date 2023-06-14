import java.util.*;
//public class Main {

	//public static void main(String[] args) {
	//	Scanner in = new Scanner(System.in);
	//	Deck d= new Deck();
	//	d.shuffle();
		//ArrayList<Card> P1=new ArrayList<>();
	//	ArrayList<Card> P2=new ArrayList<>();
		
		//for (int x=0;x<5;x++) {
	//		P1.add(d.deal());
		//	P2.add(d.deal());
	//	}
	//	for (Card c:P1) {
	//		System.out.println(c.getName());
	//	}
	//	System.out.println();
	////}

//}
import java.util.ArrayList;
import java.util.Collections;

public class WarGame {

    private static final ArrayList<Card> player1 = null;
	private static final ArrayList<Card> player2 = null;
	public static void main(String[] args) {

        // Create a deck of cards
        ArrayList<Card> deck = Deck();

        // Shuffle the deck
        Collections.shuffle(deck);

        // Divide the deck in half for each player
        ArrayList<Card> player1 = new ArrayList<Card>(deck.subList(0, 26));
        ArrayList<Card> player2 = new ArrayList<Card>(deck.subList(26, 52)); 
		 
    }
 // Play the game until one player has all the cards       
    while (!player1.isEmpty() && !player2.isEmpty()) {
   // Draw the top card for each player           
    Card player1Card = player1.remove(0);
     Card player2Card = player2.remove(0);
    
    System.out.println("Player 1's card: " + player1Card);
System.out.println("Player 2's card: " + player2Card);
    
 // Compare the cards and add them to the winner's deck         
     if (player1Card.getValue() > player2Card.getValue()) {
 System.out.println("Player 1 wins!");
 player1.add(player1Card);
 player1.add(player2Card);
    	} else if (player2Card.getValue() > player1Card.getValue()) {
    		System.out.println("Player 2 wins!");
    		player2.add(player2Card);
    		 player2.add(player1Card);
      } else {
    System.out.println("War!");
    //draw three cards from each players deck
     player1.Cards=player1.hand[:3]
     player2.Cards=player2.hand[:3]     
     //remove the war cards from each players deck
     player1.Cards=player1.hand[;3]
    player2.Cards=player2.hand[:3]      
    }
    System.out.println("Player 1's cards: " + player1.size());{
    System.out.println("Player 2's cards: " + player2.size());
}
    // Declare the winner
    if (player1.isEmpty()) {
        System.out.println("Player 2 wins the game!");
    } else {
        System.out.println("Player 1 wins the game!");
    }
}
public static ArrayList<Card> createDeck() {
    ArrayList<Card> deck = new ArrayList<Card>();

    for (int value = 2; value <= 14; value++) {
        for (int suit = 0; suit <= 3; suit++) {
            deck.add(new Card(value, suit));
        }
    }

    return deck;
 }
}
 
