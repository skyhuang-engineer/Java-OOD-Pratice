import java.util.ArrayList;
import java.util.List;

public class CardGame {
    private final List<Player> playerList;
    private final Deck deck;

    public CardGame() {
        playerList = new ArrayList<>();
        deck = new Deck();
    }

    public void addPlayers(Player player) {
        playerList.add(player);
    }

    public void startGame() {
        deck.shuffle();
        while (deck.getSize() > 0) {
            for (Player each : playerList) {
                each.getCard(deck.sendCard());
            }
        }
    }

    // public boolean compareCards(List<Card> xx, List<Card> yy) {
        // xx > yy ? true : false; -> check whose given cards are bigger
    }
}
