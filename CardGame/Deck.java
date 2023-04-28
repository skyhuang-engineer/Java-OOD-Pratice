import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for (Suit each : Suit.values()) {
                cards.add(new Card(each, i));
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int swapIdx = rand.nextInt(0,  i + 1);
            swap(swapIdx, i);
        }
    }
    private void swap(int i, int j) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    public Card sendCard()  { // send out a random card with O(1) by swapping with the card at the last idx
        if (cards == null || cards.size() == 0) {
           return null;
        }
        Random random = new Random();
        int idx = random.nextInt(cards.size());
        Card res = cards.get(idx);
        swap(cards.size() - 1, idx);
        cards.remove(cards.size() - 1);
        return res;
    }
    public int getSize() {
        return cards.size();
    }

    public Card peek() {
        if (cards == null || cards.size() == 0) {
            return null;
        }
        return cards.get(cards.size() - 1);
    }

}
