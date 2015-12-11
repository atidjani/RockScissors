package myGame;

import java.util.Random;

/*
 * We are using integer values to represent the choices
 * Scissors : 0
 * Paper	: 1
 * Rock		: 2
 * Lizard	: 3
 * Spock	: 4
 * 
 * For that an enum 'Choices' is created
 * 
 * each choice i  beats the choices i+1 and i+3 in the circle 
 */

public class Game {
	
	public static void main(String[] args) {
		
		Player playerA = new Player("PlayerA",Choices.Lizard); // new player who will choose always Lizard : 3 
		Player playerB = new Player("PlayerB");	// player B choose randomly
		
		int winsPlayerA = 0; // counter for wins of Player A
		int numOfTies = 0; // counter for Ties
		
		int numRounds = 100; //number of rounds to be played
		
		for(int i = 0; i<numRounds;i++){
			Choices choiceA = playerA.play();
			Choices choiceB = playerB.play();
			int result = choiceA.challenge(choiceB);
			if(result == 0)numOfTies++;
			if(result == 1)winsPlayerA++;
		}
		
		System.out.println("Player A wins "+ winsPlayerA +" of 100 games");
		System.out.println("Player B wins "+ (numRounds- winsPlayerA - numOfTies) +" of 100 games");
		System.out.println("Tie: "+numOfTies+" of 100 games");

	}

}
