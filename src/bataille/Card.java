package bataille;

public class Card {
	private String color;
	private int value;

	public Card(String color, int value) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.value = value;
	}
	
	public Card() {
		this.color = "Coeur";
		this.value = 1;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public String compare(Card c2) {
		if (this.getValue() == 1) {
			if (c2.getValue() == 1) {
				return "Equality";
			} else {
				return "Won";
			}
		}
		if (c2.getValue() == 1) {
			if (this.getValue() == 1) {
				return "Equality";
			} else {
				return "Lost";
			}
		}
		if (this.getValue() > c2.getValue()) {
			return "Won";
		} else if (this.getValue() == c2.getValue()) {
			return "Equality";
		} else {
			return "Lost";
		}
	}
}
