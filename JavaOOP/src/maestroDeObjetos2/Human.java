package maestroDeObjetos2;

public class Human{
	
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	
	//GETTERS
	
	public int getStrength() {
		return strength;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public int GetIntelligence() {
		return intelligence;
	}
	
	public int GetHealth() {
		return health;
	}
	
	
	public void attack() {
		
		ClaseNinja Ninja = new ClaseNinja();
		Ninja.steal();

			}
	}
