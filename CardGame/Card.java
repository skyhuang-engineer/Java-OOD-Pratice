public class Card implements Comparable<Card> {
    private Suit suit;
    private int value;
    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public Suit getSuit() {
        return this.suit;
    }
    // getter setter
    @Override
    public int compareTo(Card other) {
        return this.getValue() == other.getValue() ? this.getValue() - other.getValue() : this.getSuit().getSuitVal() - other.getSuit().getSuitVal();
    }
}
