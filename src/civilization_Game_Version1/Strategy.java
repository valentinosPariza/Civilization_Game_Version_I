package civilization_Game_Version1;
/**
 * 
 * This class is used to represent the Strategy of each civilization.This class is a type of objects which  
 *  objects contain an attribute for the overall Points in section of Strategy a civilization have.This class
 *  also includes:
 * Instance variables: 
 * {@linkplain civilization_Game_Version1.Strategy#strategyLevel}
 * {@linkplain civilization_Game_Version1.Strategy#conqueredTheWorld}
 * Two static constants:
 * {@linkplain civilization_Game_Version1.Strategy#BATTLE_INCREASE} 
 * {@linkplain civilization_Game_Version1.Strategy#SIEGE_INCREASE}
 * One Constructor:
 * {@linkplain civilization_Game_Version1.Strategy#Strategy()}
 * And instance methods:
 * {@linkplain civilization_Game_Version1.Strategy#checkForConqueredTheWorld()}
 * {@linkplain civilization_Game_Version1.Strategy#battle()}
 * {@linkplain civilization_Game_Version1.Strategy#Siege()}
 * {@linkplain civilization_Game_Version1.Strategy#conqueredTheWorld()}
 * {@linkplain civilization_Game_Version1.Strategy#getStrategyLevel()}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 21/8/2018
 *
 */
public class Strategy {

	private int strategyLevel;				//  shows the points of \Strategy level which a civilization might have

	private static final int BATTLE_INCREASE = 10;   // when battling ,a civilization gains 10 points

	private static final int SIEGE_INCREASE = 40;	//  when sieging a civilization gains 40 strategy points

	private boolean conqueredTheWorld;			//  this variable defines if a civilization has conquered the world
												//  hypothetically
	
	
	
	/**
	 * A constructor for creating a Strategy object having at the time of creation zero points of Strategy and 
	 * not yet conquered the world.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public Strategy() {
		this.strategyLevel = 0;
		this.conqueredTheWorld = false;
	}

	
	/**
	 * A method for simulating a real battle and its consequences!Increase the Strategy points of the object Strategy 
	 * with the amount of points as indicated by constant {@linkplain civilization_Game_Version1.Strategy#BATTLE_INCREASE} .
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public void battle() {
		this.strategyLevel += BATTLE_INCREASE;
		this.checkForConqueredTheWorld();
	}

	
	/**
	 * A method for simulating a real(hypothetically) siege of a place giving the opportunity to the player to 
	 * gain experience in sieging!Also this method checks if the player has gained the appropriate amount of 
	 * Strategy points in order to be the winner of the game. Increase the Strategy points of the object Strategy 
	 * with the amount of points as indicated by constant {@linkplain civilization_Game_Version1.Strategy#SIEGE_INCREASE} .
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public void Siege() {
		this.strategyLevel += SIEGE_INCREASE;
		this.checkForConqueredTheWorld();
	}

	/**
	 * A method which checks if the amount of Strategy points,which have been collected in an object Strategy have
	 * reached and passed the limit of 180 points.If this actually happens then the method changes the attribute of
	 * the object {@linkplain civilization_Game_Version1.Strategy#conqueredTheWorld} from false to true indicating that the player which
	 * has this Startegy object has conquered the world!
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	private void checkForConqueredTheWorld() {
		if (this.strategyLevel > 180)
			this.conqueredTheWorld = true;
	}

	
	/**
	 * This method (getter) returns if the Strategy of a player has reached in that point which is assumed to be a 
	 * Conquer of the world!
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return the  boolean value in the attribute {@linkplain civilization_Game_Version1.Strategy#conqueredTheWorld} 
	 */
	public boolean conqueredTheWorld() {
		return this.conqueredTheWorld;
	}

	
	/**
	 * This method (getter) returns the Strategy level which is an attribute of the Strategy object.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return the amount of Strategy points which a player has earned so far
	 *  {@linkplain civilization_Game_Version1.Strategy#strategyLevel} 
	 *  
	 */
	public int getStrategyLevel() {
		return this.strategyLevel;
	}

}
