package maestroDeObjetos;

public class Human{
	
	//Agregar los atributos de strength, stealth y intelligence con un valor predeterminado de 3.
	//Agregar el atributo health con un valor predeterminado de 100.
	
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	

	
	public Human() {
		strength= 3;
		stealth= 3;
		intelligence= 3;
		health= 100;
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
	
	//Agregar el m�todo attack(Human) y reducir el atributo health del humano atacado por los puntos de strength del humano atacante.
	
	public void attack() {
		
		int HumanAtacado = health ;
		int HumanAtacante = strength;
		
		if(strength == 100) {
			System.out.println("No te queda vida, Has muerto");
		}else {
			HumanAtacado = health - HumanAtacante;
			System.out.println("Tu salud actual al ser atacado es de: " + HumanAtacado + " puntos de salud" );
		}
		
		//CODIGO AQUI

			}
	}
