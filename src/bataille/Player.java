package bataille;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> tabCard;
	private int point;
	private String name;

	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.point = 0;
		this.tabCard = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getTabCard() {
		return tabCard;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCard(Card card) {
		this.tabCard.add(card);
	}
	
	public Card extractCard(int a) {
		Card value = this.tabCard.get(a);
		return value;
	}
}
