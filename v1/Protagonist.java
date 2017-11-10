//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW28: Ye Olde Role Playing Game
//2017-11-09

public class Protagonist {

    //Instance vars
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private double attackRating;

    //Default constructor
    public Protagonist(){
		name = "Player";
		HP = 125;
		strength = 100;
		defense = 40;
		attackRating = .4;
    }

    //Overloaded constructor;allows name input
    public Protagonist(String givenName){
		this();
		name = givenName;
    }    

    //Return if protagonist is alive
    //If HP>0, return true
    //If HP<=0, return false
    public boolean isAlive(){

        return (HP > 0);
    }
    
    //Return value of defense
    public int getDefense(){

        return defense;
    }

    //Return value of name
    public String getName(){

		return name;
    }

    //Lowers HP by inputted damage
    public void lowerHP (int damageInflicted){

        HP -= damageInflicted;
    }

     //Calculates damage dealt to inputted monster
     //Lowers inputted monster's HP by calculated damage
     //Returns damage dealt
     public int attack (Monster monster) {

     	int damage = (int)(strength * attackRating) - monster.getDefense();

		monster.lowerHP(damage);
		
		return damage;
    }

    //Prepares protagonist for special attack
    //Lowers protagonist defense by 10
    //Increases protagonist attackRating by 1
    public void specialize(){

		defense -= 10;
		attackRating += 1;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 40
    //Resets protagonist attackRating to .4
    public void normalize(){

		defense = 40;
		attackRating = .4;
    }

    //main for testing
}//end class
    
