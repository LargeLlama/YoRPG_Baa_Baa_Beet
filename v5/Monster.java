//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public abstract class Monster extends Character {
	
	private String name;

	public Monster() {
		name = "Rawr xD";
		HP = 150;
		defense = 20;
		attackRating = 1;
		strength = (int)((Math.random() * 46) + 20);

	}

	public Monster(String newName) {
		this();
		name = newName;
	}

	public String getName() {
		return name;
	}

	public abstract String about();
}
