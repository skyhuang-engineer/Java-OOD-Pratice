import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private List<Card> handcards;
    private String name;
    public Player(String name) {
        this.name = name;
        handcards = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }
    public void getCard(Card card) {
        if (card == null) {
            return;
        }
        handcards.add(card);
    }

    public Card popCard(int idx) {
        if (handcards == null || handcards.size() == 0) {
            return null;
        }
        if (idx >= handcards.size()) {
            return null;
        }
        Card res =  handcards.get(idx);
        swap(idx, handcards.size() - 1);
        handcards.remove(handcards.size() - 1);
        return res;
    }

    // Overloading : pop a list of cards:
    public List<Card> popCard(List<Integer> allIdx) {
        Collections.sort(allIdx, (o1, o2) -> o2 - o1);
        // make sure the order is in descending so that pop of previous card would not affect the idx of cards
        List<Card> res = new ArrayList<>();
        if (allIdx.size() > handcards.size()) {
            return null;
        }
        for (Integer each : allIdx) {
            res.add(popCard(each));
        }
        return res;
    }

    private void swap(int i, int j) {
        Card temp = handcards.get(i);
        handcards.set(i, handcards.get(j));
        handcards.set(j, temp);
    }
}
