//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #31: Ye Olde Role Playing Game, Expanded .
//2017-11-14

public class Protagonist extends Character {

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

    //Return value of name
    public String getName(){

		return name;
    }



    //main fc void specialize(){
	public void specialize() {
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
}//end class

    
