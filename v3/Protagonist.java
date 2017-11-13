//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #31: Ye Olde Role Playing Game, Expanded .
//2017-11-14

public class Protagonist extends Character {

    //Instance vars
    protected String name;

    //Overloaded constructor;allows name input
    public Protagonist(String givenName){
		this();
		name = givenName;
    }    

    //Return value of name
    public String getName(){

		return name;
    }

    //main for testing
}//end class
    
