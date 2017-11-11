//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW28: Ye Olde Role Playing Game
//2017-11-09

public class Protagonist extends Character {

    //Instance vars
    private String name;

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

    //Return value of name
    public String getName(){

		return name;
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
    
