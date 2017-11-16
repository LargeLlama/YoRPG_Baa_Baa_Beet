//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public class Badass_Female_Protagonist extends Protagonist {

    //Default constructor
    public Badass_Female_Protagonist() {
       	name = "Scythia Eyegouger";
		HP = 100;
		strength = 170;
		defense = 20;
		attackRating = .6;
		maxHP = 100;
		lives = 3;
    }

	public Badass_Female_Protagonist(String newName) {
		this();
		name = newName;
	}
    //Prepares protagonist for special attack
    //Lowers protagonist defense by 10
    //Increases protagonist attackRating by .9
    public void specialize(){

		defense -= 10;
		attackRating += .9;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 20
    //Resets protagonist attackRating to .6
    public void normalize(){

		defense = 20;
		attackRating = .6;
    }

    public String about() {
		String retStr = "";
		
		retStr += "She has increased strength and attackRating at the expense of decreased HP and defense.\n";
		retStr += "\tHer special move heavily increases her attackRating but also heavily decreases her defense.\n"; 
		retStr += "\tA character who packs a mean punch but cannot hold out for very long.\n";

		return retStr;
    }
    
}
