package civilization_Game_Version1;
/**
 * This class is responsible for representing the Chinese Dynasty civilization and its functions.Every Civilization as 
 * the others has their Treasury,their Strategy,their Technology,Population and more which all these are objects which 
 * are used to define better their purpose.This class has unique methods,and its unique place is Hills.
 * Instance variables: 
 * {@linkplain civilization_Game_Version1.QinDynasty#coals}
 * {@linkplain civilization_Game_Version1.QinDynasty#colony} 
 * {@linkplain civilization_Game_Version1.QinDynasty#Hills}
 * {@linkplain civilization_Game_Version1.QinDynasty#numSettlement}
 * {@linkplain civilization_Game_Version1.QinDynasty#population} 
 * {@linkplain civilization_Game_Version1.QinDynasty#river}
 * {@linkplain civilization_Game_Version1.QinDynasty#tacticsSkills} 
 * {@linkplain civilization_Game_Version1.QinDynasty#tech}
 * {@linkplain civilization_Game_Version1.QinDynasty#treasureRoom}
 * One Constructor: 
 * {@linkplain civilization_Game_Version1.QinDynasty#QinDynasty()}
 * And instance methods:
 * {@linkplain civilization_Game_Version1.QinDynasty#buildHouse(Settlement)}
 * {@linkplain civilization_Game_Version1.QinDynasty#buildWall(Settlement)}
 * {@linkplain civilization_Game_Version1.QinDynasty#getCoalMine()}
 * {@linkplain civilization_Game_Version1.QinDynasty#getDesert()}
 * {@linkplain civilization_Game_Version1.QinDynasty#getNumSettlements()}
 * {@linkplain civilization_Game_Version1.QinDynasty#getStrategy()}
 * {@linkplain civilization_Game_Version1.QinDynasty#getTechnology()}
 * {@linkplain civilization_Game_Version1.QinDynasty#getTreasury()}
 * {@linkplain civilization_Game_Version1.QinDynasty#settle(Settlement)}
 *  A publlic static variable:
 *  {@linkplain civilization_Game_Version1.QinDynasty#MAX_SETTLEMENTS}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 21/8/2018
 *
 */
public class QinDynasty {
	private static final int MAX_SETTLEMENTS = 10;
	private Population population;
	private Treasury treasureRoom;
	private CoalMine coals;
	private River river;
	private Technology tech;
	private Strategy tacticsSkills;
	private Settlement[] colony;
	private int numSettlement;
	private Hills mountains;

	
	
	
	/**
	 * A constructor of an object type of QinDynasty .This constructor like the constructors of the other civilizations
	 * create new objects(the corresponding type of  object for the each attribute) for all the attributes of this
	 *  class which are objects.
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public QinDynasty() {

		this.population = new Population();
		this.treasureRoom = new Treasury();
		this.coals = new CoalMine();
		this.river = new River("Yangtze");
		this.tech = new Technology();
		this.tacticsSkills = new Strategy();

		this.colony = new Settlement[MAX_SETTLEMENTS];
		this.numSettlement = 0;

		this.mountains = new Hills();
	}

	
	
  /**
  * This method checks if there is enough space to place the settlement in the array,if does,it sends true else false.
  * The limit of the settlements is defined by the constant {@linkplain civilization_Game_Version1.QinDynasty#MAX_SETTLEMENTS}
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
	 *  This method checks if a Wall can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * 
	 * @param settlement settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 21/8/2018
	 * @return true if the wall can be built or false otherwise
	 */
	public boolean buildWall(Settlement settlement) {

		if (settlement.build(this.treasureRoom.getCoins(), population, 1000, 100)) {
			this.population.canwork(100);
			this.tech.increaseExperience(10);
			return this.treasureRoom.spend(1000);
		}
		return false;
	}

	
	/**
	 *  This method checks if a House can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * 
	 * @param settlement settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 21/8/2018
	 * @return true if the House has been built or false otherwise
	 */
	public boolean buildHouse(Settlement settlement){
		
		if( settlement.build(this.treasureRoom.getCoins(), population, 30, 8))  {
			
			this.population.canwork(8);
			this.tech.increaseExperience(10);
			return this.treasureRoom.spend(30);
		}
		return false;
	}

	
	/**
	 * This method is used in order to represent the studying of Legalism by the Chinese.This method calls method
	 * {@linkplain civilization_Game_Version1.Technology#philosophize()} in order to increase the understanding of the civilization
	 * in object type of Technology.But also reduce the Happiness of Civilians by using the method 
	 * {@linkplain civilization_Game_Version1.Population#decreaseHappiness(int)} .
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return
	 */
	public void establishLegalism() {
		if (this.population.getHappiness() - 20 >= 0) {
			this.tech.philosophize();
			this.population.decreaseHappiness(20);
		}

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
	 * returns the Hills object of this civilization,representing the Hills which are supposed to appeared at this 
	 * civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 21/8/2018
	 * @return  the object type of Technology which is attribute of this class civilization
	 */
	public Hills getHills() {
		return this.mountains;
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
