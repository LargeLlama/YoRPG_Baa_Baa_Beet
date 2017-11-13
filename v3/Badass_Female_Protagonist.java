//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #31: Ye Olde Role Playing Game, Expanded .
//2017-11-14

public class Badass_Female_Protagonist extends Protagonist {

    //Default constructor
    public Badass_Female_Protagonist() {
        	name = "Scythia Eyegouger";
		HP = 65;
		strength = 150;
		defense = 30;
		attackRating = .8;
    }

    //Prepares protagonist for special attack
    //Lowers protagonist defense by 15
    //Increases protagonist attackRating by 1.5
    public void specialize(){

		defense -= 15;
		attackRating += 1.5;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 30
    //Resets protagonist attackRating to .8
    public void normalize(){

		defense = 30;
		attackRating = .8;
    }

    public String about() {
	return "Scythia Eyegouger is a badass female protagonist (a trope, but a good one nonetheless). She has increased strength and attackRating at the expense of decreased HP and defense. Her special move heavily increases her attackRating but also heavily decreases her defense. A character who packs a mean punch but cannot hold out for very long.";
    }
    
}
