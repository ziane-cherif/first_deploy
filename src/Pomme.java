
public class Pomme extends Fruit {
	public Pomme(int p) {
		poids = p;
		System.out.println("Création d'une pomme de " + poids + " grammes");
	}

	@Override
	public void afficher() {
		System.out.println("c'est une pomme");
	}
	
	public void affichePoids() {
		System.out.println("Le poid de la pomme est:" +poids);
	}
	
}
