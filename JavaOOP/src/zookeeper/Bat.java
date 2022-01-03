package zookeeper;

public class Bat extends Mammal {
	
	//METODOS
	public void fly(int fly) {
		
		int NivelEnergiaDespegar = 50;
		int energiaActual;
		energiaActual = EnergyLevelBat - (fly*NivelEnergiaDespegar);
		
		System.out.println("El bat al despegar us nivel de energia disminuyo hasta: " + energiaActual);	
	}
	
	public void eatHumans(int eatHumans) {
		
		int NivelEnergiaComer = 25;
		int energiaActual;
		energiaActual = EnergyLevelBat - (eatHumans*NivelEnergiaComer);
		
		System.out.println("bueno, no importa " + "Nivel de energia aumento hasta: " + energiaActual);
	}
	
	public void attackTown(int attackTown) {
		
		int NivelEnergiaAtacar = 100;
		int energiaActual;
		energiaActual = EnergyLevelBat - (NivelEnergiaAtacar*attackTown);
		
		
		System.out.println("La ciudad esta en llamas debido al ruido." + " el nivel de energia disminuyo hasta: " +energiaActual);
	}

}
