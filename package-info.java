package CardGames;
/*
card class 
--> every class has a suit
	--> hearts, diamond, clubs, spades
--> every card has a rank(i.e. it's value)
	--> ace - 1 or 11
	--> number cards - b/w 2 and 10
	--> face cards (jack, queen and king) = 10
--> each card can be face up or face down

Hand class
--> super class
	--> forms basis of all hand including the deck
--> attributes
	--> cards
--> methods
	--> clear()
	--> add(cards)
	--> give(card, otherHand)
	--> show hands()

deck class
--> a sub-class
	--> a specialized type of hand class
--> attributes
	--> cards
--> methods
	--> populate()
	--> shuffle()
	--> deal(hand, per_hand = 1)
*/