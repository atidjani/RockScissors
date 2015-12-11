package myGame;

/**
 * enum that encapsulate the possible choices a player can choose from
 */

public enum Choices{
	Scissors(0),
	Paper(1),
	Rock(2),
	Lizard(3),
	Spock(4);
		
	private final int value;
	
	Choices(final int i){
		value = i;
	}
	
	/**
	 * get the int value representing this choice 
	 * @return int
	 */
	public int getValue(){
		return value;
	}
	
	
	/**
	 * return a choice randomly
	 * @return a Choice
	 */
	public static Choices getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
	/**
	 * compare this enum object with the passed choice. it returns 0 if it is a tie, 1 if this enum wins and -1 otherwise.
	 * @param choice
	 * @return
	 */
	public int challenge(Choices choice){
		if(this==choice)return 0;
		if(choice.getValue() == (this.getValue()+1)%5 || choice.getValue() == (this.getValue()+3)%5)return 1;
		return -1;
	}
	
}
