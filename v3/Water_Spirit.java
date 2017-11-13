//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #31: Ye Olde Role Playing Game, Expanded .
//2017-11-14

public class Water_Spirit extends Protagonist {

    //Default constructor
    public Water_Spirit() {
        	name = "Aelin Bruukhawenn";
		HP = 175;
		strength = 30;
		defense = 80;
		attackRating = .2;
    }

    //Prepares protagonist for special attack
    //Lowers protagonist defense by 5
    //Increases protagonist attackRating by .5
    public void specialize(){

		defense -= 5;
		attackRating += .5;	
    }

    //Prepares protagonist for normal attack
    //Resets protagonist defense to 80
    //Resets protagonist attackRating to .2
    public void normalize(){

		defense = 80;
		attackRating = .2;
    }

    public String about() {
	return "Aelin Bruukhawenn is a water spirit who despises battle. Her low strength and attackRating are compensated, however, by her high HP and defense. Her special move does not raise her attackRating as much as the other protagonists; however, it does not drain as much of her defense. Overall, Aelin is a slow-burn endurance type.";
    }
    
}
