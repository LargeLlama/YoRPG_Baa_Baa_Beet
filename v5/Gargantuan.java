//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public class Gargantuan extends Monster {
	
	private String name;

	public Gargantuan() {
		
		name = "GARGANTUAN";
		HP = 60;
		defense = 70;
		attackRating = 1;
		strength = (int)((Math.random() * 40) + 20);

	}

	public String getName() {
		return name;
	}

	public String about() {
		return "The Gargantuan has the highest defense; good luck damaging it!";
	}
}
