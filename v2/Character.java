public class Character {

    //attributes
    public int HP;
    public int strength;
    public int defense;
    public double attackRating;

    public boolean isAlive() {
	return HP > 0;
    }

    public int getDefense() {
	return defense;
    }

    public void lowerHP( int amount ) {
	HP -= amount;
    }

    public int attack( Character character ) {
	int damage = (int) (strength * attackRating) - character.getDefense();
	character.lowerHP(damage);
	return damage;
    }
    
}
