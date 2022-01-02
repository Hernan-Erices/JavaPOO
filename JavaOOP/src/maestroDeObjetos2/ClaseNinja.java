package maestroDeObjetos2;

public class ClaseNinja extends Human {
	
	public ClaseNinja() {
		stealth = 10; // sigilo
		health = 100; // Salud
	}
	
	
	
	//METODO ROBAR
	public void steal(){
		
		int steal = stealth;
		System.out.println(steal);
		
		
	}
	
	//METODO ESCAPAR
	public void runAway() {
		int runAway=health-10;
	}

}
