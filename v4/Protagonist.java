//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #32: Ye Olde Role Playing Game, Unchained
//2017-11-15

public abstract class Protagonist extends Character {

    //Instance vars
    protected String name;

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

    
