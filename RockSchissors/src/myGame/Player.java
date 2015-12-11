package myGame;
/**
 * 
 * this class represent a simple player with a fixed strategy or a random one
 *
 */
public class Player {
	
	private String playerName;
	Choices playerChoice;
	private boolean isPlayingRandom;
	
	/**
	 * create a player (name) which will always choose the passed choice
	 * @param name
	 * @param choice
	 */
	public Player(String name, Choices choice){
		this.playerName = name;
		this.isPlayingRandom = false;
		this.playerChoice = choice;
	}
	
	/**
	 * create a player (name) who chooses randomly
	 * @param name
	 */
	public Player(String name){
		this.playerName = name;
		this.isPlayingRandom = true;
	}
	
	/**
	 * get the player choice
	 * @return Choice
	 */
	public Choices play(){
		if(isPlayingRandom){
			return Choices.getRandom();
		}else{
			return this.playerChoice;
		}
	}

}
