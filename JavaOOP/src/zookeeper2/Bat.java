package zookeeper2;

public class Bat extends BatOperation{
	
	//METODOS
	public void fly(int fly) {
		System.out.println("El bat al despegar us nivel de energia disminuyo hasta: " + fly1);	
	}
	
	public void eatHumans(int eatHumans) {	
		System.out.println("bueno, no importa " + "Nivel de energia aumento hasta: " + eatHumans1);
	}
	
	public void attackTown(int attackTown) {		
		System.out.println("La ciudad esta en llamas debido al ruido." + " el nivel de energia disminuyo hasta: " +attackTown1);
	}
	
	

}
