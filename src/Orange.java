
public class Orange extends Fruit {

	public Orange(int p) {
		poids = p;
		System.out.println("Création d'une orange de " + poids + " grammes");
	}

	@Override
	public void afficher() {
		System.out.println("c'est une orange");
	}

	public void affichePoids() {
		System.out.println("Le poid de l'orange est:" + poids);
	}

}
