package civilization_Game_Version1;

/**
 * 
 * This class represents similar with the {@linkplain civilization_Game_Version1.Fish} class the food but in this time,the food which 
 * is gained from hunting.This class contains 
 * Instance variables: {@linkplain civilization_Game_Version1.Game#healthIncrease}
 * {@linkplain civilization_Game_Version1.Building#workersRequired} 
 * Two Constructors:
 * {@linkplain civilization_Game_Version1.Game#Game()}
 * {@linkplain civilization_Game_Version1.Game#Game(int)}
 * One instance method:
 * {@linkplain civilization_Game_Version1.Game#getHealth()}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 21/8/2018
 *
 */
public class Game {

	private int healthIncrease;			// instance attribute representing the food which is available in a Game object

	/**
	 * This constructor creates an object type of Game with a given quantity of food(health points).
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @param health represents the health points which the object will have in its existence
	 * @return 
	 */
	public Game(int health) {
		this.healthIncrease = health;
	}

	/**
	 * This constructor creates an object type of Game by using the previous Constructor 
	 * {@linkplain civilization_Game_Version1.Game#Game(int)} for creating a standard object containing of 20 health points of food.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return 
	 */
	public Game() {
		this(20);
	}

	/**
	 * This  method returns the amount of food-health points which a Game object has.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return the value of the food which the object Game has(the points of health that can give to a Civilization)
	 */
	public int getHealth() {
		return this.healthIncrease;
	}
}
