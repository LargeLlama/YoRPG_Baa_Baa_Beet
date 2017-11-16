//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public abstract class Protagonist extends Character {

    //Instance vars
    protected String name;

    public Protagonist(){
	name = "Player";
	HP = 125;
	strength = 100;
	defense = 40;
	attackRating = .4;
	lives = 1;
    }
    
    //Overloaded constructor;allows name input
    public Protagonist(String givenName){
	this();
	name = givenName;
    }

    //Abstract about method
    public abstract String about();

    //Return value of name
    public String getName(){

	return name;
    }

    //main fc void specialize(){
    public abstract void specialize();

    //Abstract normalize method
    public abstract void normalize();

     
}//end class

    
