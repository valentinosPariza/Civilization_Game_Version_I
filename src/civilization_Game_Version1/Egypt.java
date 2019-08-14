package civilization_Game_Version1;

/**
 * This class is responsible for representing the Egypt civilization and its functions.Every Civilization as the others
 * has their Treasury,their Strategy,their Technology,Population and more which all these are objects which are used
 * to define better their purpose.This class has unique methods,and its unique place is Desert.
 * Instance variables: 
 * {@linkplain civilization_Game_Version1.Egypt#coals}
 * {@linkplain civilization_Game_Version1.Egypt#colony} 
 * {@linkplain civilization_Game_Version1.Egypt#desert}
 * {@linkplain civilization_Game_Version1.Egypt#numSettlement}
 * {@linkplain civilization_Game_Version1.Egypt#population} 
 * {@linkplain civilization_Game_Version1.Egypt#river}
 * {@linkplain civilization_Game_Version1.Egypt#tacticsSkills} 
 * {@linkplain civilization_Game_Version1.Egypt#tech}
 * {@linkplain civilization_Game_Version1.Egypt#treasureRoom}
 * One Constructor: 
 * {@linkplain civilization_Game_Version1.Egypt#Egypt()}
 * And instance methods:
 * {@linkplain civilization_Game_Version1.Egypt#buildPyramid(Settlement)}
 * {@linkplain civilization_Game_Version1.Egypt#getCoalMine()}
 * {@linkplain civilization_Game_Version1.Egypt#getDesert()}
 * {@linkplain civilization_Game_Version1.Egypt#getNumSettlements()}
 * {@linkplain civilization_Game_Version1.Egypt#getStrategy()}
 * {@linkplain civilization_Game_Version1.Egypt#getTechnology()}
 * {@linkplain civilization_Game_Version1.Egypt#getTreasury()}
 * {@linkplain civilization_Game_Version1.Egypt#practiceHieroglyphics()}
 * {@linkplain civilization_Game_Version1.Egypt#settle(Settlement)}
 * {@linkplain homework2.Egypt#}
 *  A publlic static variable:
 *  {@linkplain civilization_Game_Version1.Egypt#MAX_SETTLEMENTS}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 21/8/2018
 *
 */
public class Egypt {

	private static final int MAX_SETTLEMENTS = 10;		// represents the max settlements that are allowed for each 
														//  civilization
	
	private Population population;					// the population of a civilization
	
	private Treasury treasureRoom;					//  their treasury
	
	private CoalMine coals;							//  their coals
	
	private River river;							// Its river
	
	private Technology tech;					// its technological level
	
	private Strategy tacticsSkills;				// Its Strategy defined by points through the object Strategy
	
	private Settlement[] colony;				//  Their settlements,which are stored into an array,type of
												//  Settlements
	private int numSettlement;					//  the number of their Settlements
	
	private Desert desert;						// The unique place of Egypt ,Desert

	
	
	/**
	 * A constructor of an object type of Egypt .This constructor like the constructors of the other civilizations
	 * create new objects(the corresponding type of  object for the each attribute) for all the attributes of this
	 *  class which are objects.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public Egypt() {

		this.population = new Population();
		this.treasureRoom = new Treasury();
		this.coals = new CoalMine();
		this.river = new River("Nile");
		this.tech = new Technology();
		this.tacticsSkills = new Strategy();
		this.desert = new Desert();

		this.colony = new Settlement[MAX_SETTLEMENTS];
		this.numSettlement = 0;

	}
/**
 * This method checks if there is enough space to place the settlement in the array,if does,it sends true else false.
 * The limit of the settlements is defined by the constant {@linkplain civilization_Game_Version1.Egypt#MAX_SETTLEMENTS}
 * 
 * @param settlement an object settlement which shows that 
*  @author valentinos Pariza 
 * @since 21/8/2018
 * @return true if the settlement was saved,or false if there is no space for any other settlements 
 * 
 */
	public boolean settle(Settlement settlement) {

		if (this.numSettlement < MAX_SETTLEMENTS) {
			
			this.colony[this.numSettlement] = settlement;
			this.numSettlement++;
			return true;
		}
		return false;

	}

	
	/**
	 *  This method checks if a Pyramid can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * @param settlement	settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 21/8/2018
	 * @return true if the Pyramid can be built or false otherwise
	 */
	public boolean buildPyramid(Settlement settlement) {
		
		if (settlement.build(this.treasureRoom.getCoins(), population, 500, 100)) {
			this.population.canwork(100);
			this.tech.increaseExperience(10);
			return this.treasureRoom.spend(500);
		}
		return false;
	}

	
	/**
	 * This method is used in order to represent the studying and practicing of  Hieroglyphics by Egyptians.This method 
	 * calls method {@linkplain civilization_Game_Version1.Technology#improveWriting()} in order to increase the understanding of the 
	 * in object  type of  Technology.But also increase the Happiness of Civilians by using the method 
	 * civilization {@linkplain civilization_Game_Version1.Population#increaseHappiness(int)}.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public void practiceHieroglyphics() {
		this.tech.improveWriting();
		this.population.increaseHappiness(10);
	}

	/**
	 * Returns the number of Settlements that have been made
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return the number of Settlements that have been established
	 */
	public int getNumSettlements() {
		return this.numSettlement;
	}

	
	/**
	 * Returns the Treasury of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return   the object type of Treasury which is attribute of this class civilization
	 */
	public Treasury getTreasury() {
		return this.treasureRoom;
	}

	
	/**
	 * returns the Technology object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of Technology which is attribute of this class civilization
	 */
	public Technology getTechnology() {
		return new Technology(this.tech);
	}

	
	
	/**
	 * returns the CoalMine object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of CoalMine which is attribute of this class civilization
	 */
	public CoalMine getCoalMine() {

		return this.coals;
	}

	
	
	
	/**
	 * returns the River object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of river which is attribute of this class civilization
	 */
	public River getRiver() {
		return this.river;
	}

	
	
	/**
	 * returns the unique of this classcivilization  Desert  object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of Desert which is attribute of this class civilization
	 */
	public Desert getDesert() {
		return this.desert;
	}

	
	
	/**
	 * returns the array type of Settlements object-attribute of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the array type of Settlements of this civilization which is attribute of this class civilization
	 */
	public Settlement[] getSettlements() {
		return this.colony;
	}

	
	/**
	 * returns the Population object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of Population which is attribute of this class civilization
	 */
	public Population getPopulation() {
		return this.population;
	}

	
	/**
	 * returns the Strategy object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of Strategy which is attribute of this class civilization
	 */
	public Strategy getStrategy() {
		return this.tacticsSkills;
	}
}
