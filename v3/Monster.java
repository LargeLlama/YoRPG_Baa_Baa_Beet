//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW30: Ye Olde Role Playing Game, Improved
//2017-11-13


public class Monster extends Character {
	
	private String name;

	public Monster() {

		HP = 150;
		defense = 20;
		attackRating = 1;
		strength = (int)((Math.random() * 46) + 20);

	}

	public String getName() {
		return name;
	}
}
