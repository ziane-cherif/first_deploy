
public abstract class Fruit {
	
	protected int poids;
	public Fruit() {
		System.out.println("Création d'un Fruit");
	}
	public void afficher() {
		System.out.println("C'est un Fruit");
	}
	
	public abstract void affichePoids();

}
