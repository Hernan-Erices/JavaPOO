package maestroDeObjetos2;

public class ClaseWizard extends Human {
	
	public ClaseWizard() {
		intelligence = 8; //inteligencia
		health = 50; // Salud
	}
	
	
	
	//METODO CURAR
	public void heal() {
		int heal = intelligence;
		
		if(health<50) {
			int healthActual = heal + health;
			System.out.println("Tu salud actual es: " + healthActual);
		}else {
			System.out.println("No puedes tener mas de 50 puntos de salud");
		}
	}

	//METODO BOLA DE FUEGO
	public void fireBall(Human victima) {
		
		int fireBall = 3*intelligence;
		
		victima.health = fireBall - victima.health;
		
		System.out.println("La victima es " + victima + " y su salud se redujo a " + victima.health + " puntos de salud");
		

		health = health - fireBall;
		
		if(health < 1) {
			System.out.println("Has muerto");
		}else {
			System.out.println(health);
		}
	}

}
