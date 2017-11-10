//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW28: Ye Olde Role Playing Game
//2017-11-09


public class Monster {
	
	private String name;
	private int HP;
	private int strength;
	private int defense;
	private double attackRating;

	public Monster() {

		HP = 150;
		defense = 20;
		attackRating = 1;
		strength = (int)((Math.random() * 45) + 20);

	}

	public boolean isAlive() {
		return HP > 0;
	}
	
	public int getDefense() {
		return defense;
	}

	public String getName() {
		return name;
	}

	public void lowerHP(int amount) {
		HP -= amount;
	}
	
	public int attack(Protagonist protagonist) {

		int damage = (int)(strength * attackRating) - protagonist.getDefense();

		protagonist.lowerHP(damage);	

		return damage;

	}
	


}
