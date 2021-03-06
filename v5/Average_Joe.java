//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public class Average_Joe extends Protagonist {

    //Default constructor
    public Average_Joe() {
    name = "Average Joe";
	HP = 125;
	strength = 120;
	defense = 30;
	attackRating = .5;
	maxHP = 125;
	lives = 3;
    }

	public Average_Joe(String newName) {
		this();
		name = newName;
	}

    //Prepares protagonist for special attack
    //Lowers protagonist defense by 10
    //Increases protagonist attackRating by .6
    public void specialize(){

		defense -= 10;
		attackRating += .6;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 30
    //Resets protagonist attackRating to .5
    public void normalize(){

		defense = 30;
		attackRating = .5;
    }

    public String about() {
		String retStr = "";
		
		retStr += "Average Joe is your run-of-the-mill RPG protagonist.\n"; 
		retStr += "\tHe likes to burp, fart, and pick his nose just like any other human being.\n";
		retStr += "\tHis defense is 30 and his attackRating is .4 -- both average values that give him a decent chance of survival.\n";
		retStr += "\tHe is nothing extraordinary, but even Average Joe can be a hero sometimes.";

		return retStr;

	}
    
}
