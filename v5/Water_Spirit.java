//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public class Water_Spirit extends Protagonist {

    //Default constructor
    public Water_Spirit() {
       	name = "Aelin Bruukhawenn";
		HP = 175;
		strength = 70;
		defense = 40;
		attackRating = .5;
		maxHP = 175;
		lives = 3;

    }

	public Water_Spirit(String newName) {
		this();
		name = newName;
	}

    //Prepares protagonist for special attack
    //Lowers protagonist defense by 5
    //Increases protagonist attackRating by .5
    public void specialize(){

		defense -= 5;
		attackRating += .5;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 40
    //Resets protagonist attackRating to .2
    public void normalize(){

		defense = 40;
		attackRating = .2;
    }

    public String about() {
		String retStr = "";
		
		retStr += "Water spirits despise battle.\n";
		retStr += "\tHer low strength and attackRating are compensated, however, by her high HP and defense.\n";
		retStr += "\tHer special move does not raise her attackRating s much as the other protagonists; however, it does not drain as much of her defense.\n";
		retStr += "\tOverall, Aelin is a slow-burn endurance type.\n";
	
		return retStr;
    }
    
}
