
public class App {

	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[3];
		fruits[0]= new Pomme(50);
		fruits[0]= new Orange(70);
		fruits[0]= new Pomme(60);
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i].affichePoids();
			
		}

	}
}
