package maestroDeObjetos2;

public class ClaseNinja extends Human {
	
	public ClaseNinja() {
		stealth = 10;
	}
	
	//METODO ROBAR
	public void steal(Human victima){
		
		
		int steal = stealth;
		health = steal + victima.health;
		victima.health = victima.health - stealth;
		System.out.println("La salud de la victima " + victima + " se redujo a: " + victima.health);
		
		
		
		System.out.println("Tu salud actual es de:" + health);
		
		//if(health>100) {
		//	System.out.println("No puedes tener mas de 100 puntos de salud");
		//}else {
		//	System.out.println(health);
		//}	
	}
	
	//METODO ESCAPAR
	public void runAway() {
		int runAway=health-10;
		if(health<11) {
			System.out.println("Has muerto");
		}else {
			System.out.println("has escapado, tu salud actual es de: " + runAway + " puntos de salud");
		}
	}

}
