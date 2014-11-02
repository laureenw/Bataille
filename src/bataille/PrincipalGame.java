package bataille;

import java.util.ArrayList;

public class PrincipalGame {
	private ArrayList<Card> bundle = new ArrayList<Card>();
	private String color = "";
	private int distrib = 0;
	private int bundleSize = 52;
	Player j1 = new Player("toto");
	Player j2 = new Player("titi");

	public PrincipalGame() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 4; i++) {
			if (i==0) {
				color = "coeur";
			}
			if (i==1) {
				color = "carreau";
			}
			if (i==2) {
				color = "pique";
			}
			if (i==3) {
				color = "trèfle";
			}
			for (int a = 1; a < 14; a++) {
				bundle.add(new Card(color, a));
			}
		}
		int tailleInitiale = bundle.size();
		for (int b = 0; b < tailleInitiale; b++) {
			int random = (int)(Math.random() * (bundleSize - 0));
			if (distrib == 0) {
				j1.addCard(bundle.get(random));
				bundle.remove(random);
				bundleSize--;
				distrib++;
			} else {
				j2.addCard(bundle.get(random));
				bundle.remove(random);
				bundleSize--;
				distrib--;
			}
		}
		
		for (int c = 0; c < 26; c++) {
			Card carteJ1 = j1.extractCard(c);
			Card carteJ2 = j2.extractCard(c);
			String result = carteJ1.compare(carteJ2);
			if (result == "Won") {
				j1.setPoint(j1.getPoint()+1);
			} else if (result == "Lost") {
				j2.setPoint(j2.getPoint()+1);
			}
			System.out.println(j1.getName()+" : "+j1.getPoint()+" - "+j2.getPoint()+" : "+j2.getName());
		}
		if (j1.getPoint() > j2.getPoint()) {
			System.out.println("The winner is : "+j1.getName());
		} else {
			System.out.println("The winner is : "+j2.getName());
		}
	}
}
