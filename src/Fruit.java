
public abstract class Fruit {
	
	protected int poids;
	public Fruit() {
		System.out.println("Cr�ation d'un Fruit");
	}
	public void afficher() {
		System.out.println("C'est un Fruit");
	}
	
	public abstract void affichePoids();

}
