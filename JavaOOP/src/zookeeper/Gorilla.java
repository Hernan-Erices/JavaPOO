package zookeeper;

public class Gorilla extends Mammal{
		
	//METODOS
	
	//-5 energia
	public void throwSomething(int lanzarBanana) {
		
		int NivelEnergiaLanzar = 5;
		int energiaActual;
		energiaActual = nivelEnergia - (lanzarBanana*NivelEnergiaLanzar);
		System.out.println("el gorila ha lanzado algo " + lanzarBanana + " veces " +", Nivel de energia disminuyo en: " + energiaActual);
	}
	
	//+10 energia
	public void eatBananas(int comerBanana) {
		int NivelEnergiaComer = 10;
		int energiaActual;
		energiaActual = nivelEnergia + (comerBanana*NivelEnergiaComer);
		
		System.out.println("El gorilla comio " + comerBanana + " veces, la satisfacción del gorila e incrementar su nivel de energía en: " + energiaActual);	
	}
	//-10 energia
	public void climb(int treparArbol) {
		
		int NivelEnergiaTrepar = 10;
		int energiaActual;
		energiaActual = nivelEnergia - (treparArbol*NivelEnergiaTrepar);
		
		System.out.println("el gorila ha trepado "+ treparArbol + " vez, a la cima de un árbol y disminuye su nivel de energía en: " + energiaActual);
	}
	
	
	
	
	

}
