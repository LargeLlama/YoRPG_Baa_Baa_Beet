//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #32: Ye Olde Role Playing Game, Unchained
//2017-11-15

public class Brownie extends Monster {
	
	private String name;

	public Brownie() {
		
		name = "BROWNIE";
		HP = 300;
		defense = 2;
		attackRating = .2;
		strength = (int)((Math.random() * 10) + 20);

	}

	public String getName() {
		return name;
	}

	public static String about() {
		return "The Brownie is a little creature who inflicts very litte damage, but who has HP to last a while--you can beat the Brownie, but only if you last long enough!";
	}
}
