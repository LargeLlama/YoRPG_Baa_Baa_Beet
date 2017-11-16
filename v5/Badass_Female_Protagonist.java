//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public class Badass_Female_Protagonist extends Protagonist {

    //Default constructor
    public Badass_Female_Protagonist() {
       	name = "Scythia Eyegouger";
		HP = 100;
		strength = 150;
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
    //Lowers protagonist defense by 15
    //Increases protagonist attackRating by 1.5
    public void specialize(){

		defense -= 10;
		attackRating += 1.2;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 30
    //Resets protagonist attackRating to .8
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
