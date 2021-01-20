package CardGames;

public class Card {
	
	private Suits suit;
	private Rank value;
	
	public Card(Suits suit, Rank value){
		this.suit = suit;
		this.value = value;
	}
	
	public String toString(){
		return this.suit.toString() + "-" + this.value.toString();
	}
	
	public Rank getValue(){
		return this.value;
	}
}
