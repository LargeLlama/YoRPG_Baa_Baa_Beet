//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #32: Ye Olde Role Playing Game, Unchained
//2017-11-15

public class Gargantuan extends Monster {
	
	private String name;

	public Gargantuan() {
		
		name = "GARGANTUAN";
		HP = 100;
		defense = 40;
		attackRating = 1;
		strength = (int)((Math.random() * 40) + 30);

	}

	public String getName() {
		return name;
	}

	public static String about() {
		return "The Gargantuan has the highest defense; good luck damaging it!";
	}
}
