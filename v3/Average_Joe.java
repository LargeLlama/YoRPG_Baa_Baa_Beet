//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #31: Ye Olde Role Playing Game, Expanded .
//2017-11-14

public class Average_Joe extends Protagonist {

    //Default constructor
    public Average_Joe() {
        	name = "Average Joe";
		HP = 125;
		strength = 100;
		defense = 40;
		attackRating = .4;
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

    public String about() {
	return "Average Joe is your run-of-the-mill RPG protagonist. He likes to burp, fart, and pick his nose just like any other human being. His defense is 40 and his attackRating is .4 -- both average values that give him a decent chance of survival. He is nothing extraordinary, but even Average Joe can be a hero sometimes.";
    }
    
}
