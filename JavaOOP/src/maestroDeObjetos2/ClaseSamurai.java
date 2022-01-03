package maestroDeObjetos2;

public class ClaseSamurai extends Human {
	
	//CONSTRUCTOR
	public ClaseSamurai() {
		health = 200; // Salud
	}
	
	//METODO GOLPE MORTAL
	public void deathBlow(Human victima) {
		
		health = health/2;		
		victima.health = 0;
		
		System.out.println("tu victima fue " + victima + " y fue asesinado. \n" +"Salud actual: " + health);
		System.out.println("la salud de la victima es:" + victima.health);
		
	}
	
	//METODO MEDITAR
	public void meditate() {
		int meditar;
		meditar = (health/2) + health;
		if(meditar>200) {
			System.out.println("No puedes tener mas de 200 puntos de salud");
		}else {
			System.out.println("Tu salud aunmento a: " + meditar + " puntos de salud");
		}
	}
	
	

}
