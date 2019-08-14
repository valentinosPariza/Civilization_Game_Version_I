package civilization_Game_Version1;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * This class represents the Desert in the game.It is used as a type of objects
 * in order to simulate a Dessert and some functions of it. Instance variables:
 * {@linkplain civilization_Game_Version1.Desert#scan} Two Instance Methods:
 * {@linkplain civilization_Game_Version1.Desert#findTreasure()}
 * {@linkplain civilization_Game_Version1.Desert#lost()}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 21/8/2018
 *
 */

public class Desert {
	private Scanner scan = new Scanner(System.in); // an object type of Scanner for receiving input in the program

	/**
	 * This method id used in order to search the desert fot treasure.This means
	 * that it generates a pseudorandom number (between 1-500)for treasure and a
	 * second number between zero and nine(all inclusive) in order to definr if the
	 * player have been lost.This happens if the second pseudorandom number is
	 * zero(1/10 possibility of being lost).If the player is lost the program calls
	 * the method lost to make player decide if he/she wants to escape and if he/she
	 * escapes,returns back zero coins.This method uses method
	 * {@linkplain civilization_Game_Version1.Desert#lost()}.
	 * 
	 * @author valentinos Pariza
	 * @since 21/8/2018
	 * @return an integer number representing the coins which player has earned(if
	 *         he/she earned)
	 */
	public int findTreasure() {
		int coins = 0;
		
		Random rand = new Random();

		int possibilityToLost = rand.nextInt(10);
		coins = (rand.nextInt(500) + 1);

		if (possibilityToLost == 0) {			// suppose that if the player get lost then he tries to escape dessert
			coins = 0;							//  ,losing all his/her coins.The player get lost if the program
												//  after generates a pseudorandom number between 0-9 ,which number
			 while (this.lost());				// is 0 1:10 possibility to get 0.	
		}

		return coins;
	}

	/**
	 * This method is used when player is lost in Desert(this is being checked in method 
	 * {@linkplain civilization_Game_Version1.Desert#findTreasure()}).If this method is called ,it asks the player by using a Scanner 
	 * object from {@linkplain java.util.Scanner} if he/she wants to escape from desert.Then it returns his/her 
	 * decision.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return a boolean expression tha indicates if player wants to escape or not from desert
	 */
	public boolean lost() {
		System.out.println(
			"You have gotten lost! Press 1 to try escaping the" + " Desert.\nHopefully you can make it out alive.");
		int move = scan.nextInt();
		return (move == 1) ? false : true;
	}
}