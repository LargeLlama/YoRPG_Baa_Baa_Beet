//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

public class Character {

    //Initialize attributes
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;
    protected int lives;

    //Return if Character is alive
    public boolean isAlive() {
		return HP > 0;
    }

	public int getHP() {
		return HP;
	}

    //Return value of defense
    public int getDefense() {
		return defense;
    }

    //Lower Character HP by inputted amount
    public void lowerHP( int amount ) {
		HP -= amount;
    }

	public void setHP(int amount) {
		HP = amount;
	}

    //Attack method:
    //Calculate damage
    //Lower Character HP by calculated damage
    //Return calculated damage
    public int attack( Character character ) {
	int damage = (int) (strength * attackRating) - (character.getDefense()/2);

		if (damage < 0) {
		    damage = 0;
		}

		character.lowerHP(damage);

		return damage;

    
	}
}
