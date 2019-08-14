package civilization_Game_Version1;

/**
 * 
 * This class is used for representing the fish in the game as objects.In this object some functions and attributes
 * of the fish as food for people ,is used for succeeding the purpose of the game!This class contains:
 * One Instance attribute:
 * {@linkplain civilization_Game_Version1.Fish#healthIncrease} 
 * One Instance Methods:
 * {@linkplain civilization_Game_Version1.Fish#getHealth()} 
 * Three Constructors
 * {@linkplain civilization_Game_Version1.Fish#Fish()} 
 * {@linkplain civilization_Game_Version1.Fish#Fish(Fish)}
 * {@linkplain civilization_Game_Version1.Fish#Fish(int)}  
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 21/8/2018
 *
 */

public class Fish {
	private int healthIncrease;			//  represents the quantity of food represented by fish

	/**
	 * Copy Constructor for copying the only attribute of an object type of Fish to a new Fish Object.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @param fish Object fish
	 * @return
	 */
	public Fish(Fish fish) {
		this.healthIncrease = fish.healthIncrease;
	}

	/**
	 *A constructor which creates an Object type of fish which has been assigned an integer value 
	 *(in the its field healthIncrease)
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @param heatlth representing the quantity of food in a fish/or a group of fish
	 * @return
	 */
	public Fish(int health) {
		this.healthIncrease = health;
	}

	/**
	 *A constructor which creates an Object type of fish .It uses this {@linkplain civilization_Game_Version1.Fish#Fish(int)}
	 *constructor for creating a standard object Fish containing 20 -quantity of food in this fish object.   
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public Fish() {
		this(20);
	}

	/**
	 *A getter method which returns the attribute {@linkplain civilization_Game_Version1.Fish#healthIncrease}  of the Class 
	 *{@linkplain civilization_Game_Version1.Fish}. 
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return the value of the food in fish which the object fish has(the points of health that can give to a 
	 * Civilization)
	 */
	public int getHealth() {
		return healthIncrease;

	}
}