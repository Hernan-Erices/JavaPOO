package maestroDeObjetos2;

public class HumanTest{

	public static void main(String[] args) {
		
		//Human human = new Human();
		//human.attack();
		
		ClaseNinja Ninja = new ClaseNinja();
		ClaseSamurai Samurai = new ClaseSamurai();
		ClaseWizard Wizard = new ClaseWizard();
		
		System.out.println("CLASE WIZARD");
		Wizard.fireBall(Ninja);
		Wizard.heal();
		
		System.out.println("-----------------------------");
		System.out.println("CLASE SAMURAI");
		Samurai.deathBlow(Wizard);
		Samurai.meditate();
		
		
		System.out.println("-----------------------------");
		System.out.println("CLASE NINJA");
		Ninja.runAway();
		Ninja.steal(Samurai);
		
		
		
		//CAMPO DE BATALLA
		
		
		
		
		
		
		
		

	}
}
