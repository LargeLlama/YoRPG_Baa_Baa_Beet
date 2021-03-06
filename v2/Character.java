//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW30: Ye Olde Role Playing Game, Improved
//2017-11-13

public class Character {

    //Initialize attributes
    public int HP;
    public int strength;
    public int defense;
    public double attackRating;

    //Return if Character is alive
    public boolean isAlive() {
		return HP > 0;
    }

    //Return value of defense
    public int getDefense() {
		return defense;
    }

    //Lower Character HP by inputted amount
    public void lowerHP( int amount ) {
		HP -= amount;
    }

    //Attack method:
    //Calculate damage
    //Lower Character HP by calculated damage
    //Return calculated damage
    public int attack( Character character ) {
		int damage = (int) (strength * attackRating) - character.getDefense();
		character.lowerHP(damage);

		return damage;

    
}
